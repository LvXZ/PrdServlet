package com.prd.warehouse.service.decorator;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prd.user.api.UserAPI;
import com.prd.user.entity.Employee;
import com.prd.warehouse.dto.MessageDTO;
import com.prd.warehouse.dto.ResponseDTO;
import com.prd.warehouse.service.DispatchService;
import com.prd.warehouse.util.ServletUtil;
import java.io.IOException;


/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-08-13  10:16
 */

public class DispatchDecorator implements DispatchService {


    //构造decorator对象
    private final DispatchService dispatchService;
    //通用用户api
    private final UserAPI userAPI;

    public DispatchDecorator(DispatchService dispatchService, UserAPI userAPI) {
        this.dispatchService = dispatchService;
        this.userAPI = userAPI;
    }

    @Override
    public ResponseDTO<String> inputForm(String params) {

        String formID = parseJSON(params);
        Employee employee = JSON.parseObject(params, Employee.class);

        ResponseDTO<String> responseDTO = null;


        if(!ServletUtil.SHOULD_WAREHOUSE){//查看模块是否激活
            return ResponseDTO.fail(MessageDTO.MODULE_WAREHOUSE);
        }

        boolean user_flag = userAPI.findEmployeeExistByID(employee);
        if(ServletUtil.SHOULD_USER != user_flag){
            return ResponseDTO.fail(MessageDTO.LOGIN_FAIL_0);
        }


        boolean shouldRollback = false;
        try {
            beginTransaction();
            responseDTO = dispatchService.inputForm(formID);
        } catch (Exception e) {
            shouldRollback = true;
            throw e;
        } finally {
            if (shouldRollback) {
                rollback();
            } else {
                commit();
            }
            return responseDTO;
        }

    }

    @Override
    public ResponseDTO<String> outputForm(String params) {

        String formID = parseJSON(params);
        ResponseDTO<String> responseDTO = null;

        if(!ServletUtil.SHOULD_WAREHOUSE){//查看模块是否激活
            return ResponseDTO.fail(MessageDTO.MODULE_WAREHOUSE);
        }


        boolean shouldRollback = false;
        try {
            beginTransaction();

            responseDTO = dispatchService.outputForm(formID);

        } catch (Exception e) {
            shouldRollback = true;
            throw e;
        } finally {
            if (shouldRollback) {
                rollback();
            } else {
                commit();
            }
            return responseDTO;
        }
    }

    @Override
    public ResponseDTO<String> transferForm(String params) {

        String formID = parseJSON(params);
        ResponseDTO<String> responseDTO = null;

        if(!ServletUtil.SHOULD_WAREHOUSE){//查看模块是否激活
            return ResponseDTO.fail(MessageDTO.MODULE_WAREHOUSE);
        }


        boolean shouldRollback = false;
        try {
            beginTransaction();

            responseDTO = dispatchService.transferForm(formID);

        } catch (Exception e) {
            shouldRollback = true;
            throw e;
        } finally {
            if (shouldRollback) {
                rollback();
            } else {
                commit();
            }
            return responseDTO;
        }
    }

    private String parseJSON(String params){

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode paramJson = null;
        try {
            paramJson = objectMapper.readTree(params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String formID = paramJson.get("formID").textValue();
        return formID;

    }

    private void commit() {
        System.out.println("commit");
    }

    private void rollback() {
        System.out.println("rollback");
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }

}
