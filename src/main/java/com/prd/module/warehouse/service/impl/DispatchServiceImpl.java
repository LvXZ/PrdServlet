package com.prd.module.warehouse.service.impl;

import com.prd.aspect.test.AuthorityEnum;
import com.prd.aspect.test.PermissionNeed;
import com.prd.module.warehouse.dao.*;
import com.prd.dto.MessageDTO;
import com.prd.dto.ResponseDTO;
import com.prd.module.warehouse.entity.*;
import com.prd.module.warehouse.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


/**
 * @ClassName: DispatchServiceImpl
 * @Description: 库房出入库调度服务层接口具体实现
 * @Author: lvxz
 * @Date: 2018-08-01  14:45
 */
@Service
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    InvMoveOrderDAO invMoveOrderDAO;

    @Autowired
    InvTransactionTypeDAO invTransactionTypeDAO;

    @Autowired
    InvWarehouseDAO invWarehouseDAO;

    @Autowired
    InvLocationDAO invLocationDAO;

    @Autowired
    InvInventoryDAO invInventoryDAO;




    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public ResponseDTO<String> inputForm(String formID) {

        InvMoveOrder getInvMoveOrder = invMoveOrderDAO.selectInvMoveOrderById(formID);
        String checkFlowResult = checkTransactionFlow(getInvMoveOrder,"I");
        if(checkFlowResult != null){
            return ResponseDTO.fail(checkFlowResult);
        }

        //check item_id功能待实现

        String checkDestinationResult = checkDestinationIDs(getInvMoveOrder.getDestWhId(), getInvMoveOrder.getDestLocaId(), "I");
        if(checkDestinationResult != null){
            return ResponseDTO.fail(checkDestinationResult);
        }

        //check dest/source_order_id(depends)功能待实现

        String checkExecuteResult = executeInput(getInvMoveOrder);
        if(checkExecuteResult == null){
            //sqlSession.commit();
            return ResponseDTO.success(MessageDTO.INPUT_SUCCESS);
        }
        //sqlSession.rollback();
        return ResponseDTO.fail(checkExecuteResult);

    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public ResponseDTO<String> outputForm(String formID) {

        InvMoveOrder getInvMoveOrder = invMoveOrderDAO.selectInvMoveOrderById(formID);
        String checkFlowResult = checkTransactionFlow(getInvMoveOrder,"O");
        if(checkFlowResult != null){
            return ResponseDTO.fail(checkFlowResult);
        }

        //check item_id功能待实现

        String checkSourceIDsResult = checkSourceIDs(getInvMoveOrder.getSourceWhId(), getInvMoveOrder.getSourceLocaId(), "O");
        if(checkSourceIDsResult != null){
            return ResponseDTO.fail(checkSourceIDsResult);
        }

        //check dest/source_order_id(depends)功能待实现

        String checkExecuteResult = executeOutput(getInvMoveOrder);
        if(checkExecuteResult == null){
            //sqlSession.commit();
            return ResponseDTO.success(MessageDTO.OUTPUT_SUCCESS);
        }
        //sqlSession.rollback();
        return ResponseDTO.fail(checkExecuteResult);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public ResponseDTO<String> transferForm(String formID) {

        InvMoveOrder getInvMoveOrder = invMoveOrderDAO.selectInvMoveOrderById(formID);
        String checkFlowResult = checkTransactionFlow(getInvMoveOrder,"T");
        if(checkFlowResult != null){
            return ResponseDTO.fail(checkFlowResult);
        }

        //check item_id功能待实现

        //入库库房检查
        String checkDestinationResult = checkDestinationIDs(getInvMoveOrder.getDestWhId(), getInvMoveOrder.getDestLocaId(), "I");
        if(checkDestinationResult != null){
            return ResponseDTO.fail(checkDestinationResult);
        }
        //出库库房检查
        String checkSourceIDsResult = checkSourceIDs(getInvMoveOrder.getSourceWhId(), getInvMoveOrder.getSourceLocaId(), "O");
        if(checkSourceIDsResult != null){
            return ResponseDTO.fail(checkSourceIDsResult);
        }

        //check dest/source_order_id(depends)功能待实现

        //出库
        String checkExecuteOutResult = executeOutput(getInvMoveOrder);
        if(checkExecuteOutResult == null){

            //入库
            String checkExecuteInResult = executeInput(getInvMoveOrder);
            if(checkExecuteInResult == null){
                //sqlSession.commit();
                return ResponseDTO.success(MessageDTO.TRANSFER_SUCCESS);
            }

        }
        //sqlSession.rollback();
        return ResponseDTO.fail(MessageDTO.TRANSFER_FAIL);
    }




    /**
     * 检查订单InvMoveOrder的正确性   检查订单InvTransactionType的明确流程
     * @param getInvMoveOrder
     * @param type
     * @return
     */
    private String checkTransactionFlow(InvMoveOrder getInvMoveOrder, String type){

        String returnString = null;

        if (getInvMoveOrder == null) {
            returnString =  "订单不存在";
            //异常
        }else if (!getInvMoveOrder.getOrderStatus().equals("N")) {

            switch (getInvMoveOrder.getOrderStatus()){
                case "Y":{
                    returnString = "订单已处理";
                }break;

                case "I":{
                    returnString = "订单已失效/作废";
                }break;

                default:{
                    returnString = "订单错误";
                }break;
            }//异常--  Y:已处理, N:未处理, I:失效/作废, E:错误
        }else {

            //通过InvMoveOrder.transId查询事务表InvTransactionType
            InvTransactionType getInvTransactionType = invTransactionTypeDAO.selectInvTransactionTypeByID(getInvMoveOrder.getTransId());
            if (getInvTransactionType == null) {
                returnString = "订单对应事务不存在";

            }else if (!getInvTransactionType.getEnableFlag().equals("Y")) {
                returnString = "订单对应事务失效";
                //异常--  Y: 有效 N: 失效

            }else if (!getInvTransactionType.getTransFlow().equals(type)) {

                switch (getInvTransactionType.getTransFlow()){
                    case "I":{
                        returnString = "无法执行操作，订单事务执行方向为入库";
                    }break;

                    case "O":{
                        returnString = "无法执行操作，订单事务执行方向为出库";
                    }break;

                    case "T":{
                        returnString = "无法执行操作，订单事务执行方向为转移";
                    }break;
                }//异常--  事务方向 I(n) 入库 O(ut) 出库 T(ransfer) 转移
            }
        }
        return returnString;
    }


    /**
     * 检查Destination仓库位置的正确性
     * @param getDestWhId
     * @param getDestLocaId
     * @param type
     * @return
     */
    private String checkDestinationIDs(String getDestWhId, String getDestLocaId, String type){

        String returnString = null;
        //通过InvMoveOrder.destWhId和destLocaId,确定能否入库的条件
        InvWarehouse getInvWarehouse = invWarehouseDAO.selectInvWarehouseByID(getDestWhId);
        if (getInvWarehouse == null) {
            returnString = "该单无法执行入库，对应库房id不存在";
            //异常
        }else{

            InvLocation getInvLocation = invLocationDAO.selectInvLocationByID(getDestLocaId);
            if (getInvLocation == null) {
                returnString = "该单无法执行入库，库房中的位置location不存在|被占用";
                //异常
            }else if (!getInvLocation.getLocaStatus().equals("Y")) {
                returnString = "switch()3";
                //异常-- Y生效, N失效, S停用(无库存), F冻结(有库存)
            }else{

                switch (type) {
                    case "I":{
                        //入库
                        if (!getInvLocation.getRuku().equals(type)) {
                            returnString = "库房中的位置location拒绝执行入库";
                        }
                    }break;


                    case "T":{
                        //入库
                        if (!getInvLocation.getZhuanru().equals(type)) {
                            returnString = "库房中的位置location拒绝执行入库";
                        }
                    }break;
                }
            }
        }
        return returnString;

    }

    /**
     * 检查Source仓库位置的正确性
     * @param getSourceWhId
     * @param getSourceLocaId
     * @param type
     * @return
     */
    private String checkSourceIDs(String getSourceWhId, String getSourceLocaId, String type){

        String returnString = null;

        //通过InvMoveOrder.sourceWhId和sourceLocaId,确定能否出库的条件
        InvWarehouse getInvWarehouse = invWarehouseDAO.selectInvWarehouseByID(getSourceWhId);
        if (getInvWarehouse == null) {
            returnString = "该单无法执行出库，对应库房id不存在";
            //异常
        }else {

            InvLocation getInvLocation = invLocationDAO.selectInvLocationByID(getSourceLocaId);
            if (getInvLocation == null) {
                returnString = "该单无法执行出库，库房中的位置location不存在|被占用";
                //异常
            }else if (!getInvLocation.getLocaStatus().equals("Y")) {
                returnString = "switch()3";
                //异常--switch()  Y生效, N失效, S停用(无库存), F冻结(有库存)
            }else{

                switch (type) {

                    case "O":{
                        //出库
                        if (!getInvLocation.getChuku().equals(type)) {
                            returnString = "库房中的位置location拒绝执行出库";
                        }
                    }break;

                    case "T":{
                        //出库
                        if (!getInvLocation.getZhuanchu().equals(type)) {
                            returnString = "库房中的位置location拒绝执行入库";
                        }
                    }break;
                }
            }
        }
        return returnString;
    }


    /**
     * 真正执行入库
     * @param getInvMoveOrder
     * @return
     */
    private String executeInput(InvMoveOrder getInvMoveOrder){

        String returnString = null;

        InvInventory getInvInventory = invInventoryDAO.selectInvInventoryByInvMoveOrder(getInvMoveOrder);
        if (getInvInventory == null) {
            returnString = "该单无法执行入库，对应库存不满足条件";
            //异常
        }else{
            //真正执行入库
            getInvInventory.setQuantity(getInvInventory.getQuantity().add(getInvMoveOrder.getOrderQuantity()));

            int flag1 = invInventoryDAO.updateInvInventoryBySelf(getInvInventory);

            getInvMoveOrder.setOrderStatus("Y");
            int flag2 = invMoveOrderDAO.updateOrderStatusByID(getInvMoveOrder);

            if (flag1 != 1 || flag2 != 1) {
                returnString = "入库失败";
            }
        }
        return returnString;
    }


    /**
     * 真正执行出库
     * @param getInvMoveOrder
     * @return
     */
    private String executeOutput(InvMoveOrder getInvMoveOrder){

        String returnString = null;

        InvInventory getInvInventory = invInventoryDAO.selectInvInventoryByInvMoveOrder2(getInvMoveOrder);
        if (getInvInventory == null) {
            returnString = "该单无法执行出库，对应库存不满足条件";
            //异常
        }else{
            //检查q-a-b是否大于order_quality
            //q-a-b-order_quality  大于0 说明 q-a-b大于order_quality ,可以出库
            int flag = (getInvInventory.getQuantity().subtract(getInvInventory.getAssignQuantity()).subtract(getInvInventory.getBlockQuantity())).subtract(getInvMoveOrder.getOrderQuantity()).compareTo(BigDecimal.ZERO);
            //可以出库
            if (flag >= 0) {
                getInvInventory.setQuantity(getInvInventory.getQuantity().subtract(getInvMoveOrder.getOrderQuantity()));
                int flag1 = invInventoryDAO.updateInvInventoryBySelf(getInvInventory);

                //搬运订单已处理
                getInvMoveOrder.setOrderStatus("Y");
                int flag2 = invMoveOrderDAO.updateOrderStatusByID(getInvMoveOrder);

                if (flag1 != 1 || flag2 != 1) {
                    returnString = "出库失败";
                }
            }else{
                returnString = "出库失败,库存不足";
            }
        }
        return returnString;
    }

}
