package com.prd.module.warehouse0.dao;

import com.prd.module.warehouse0.entity.InvInventory;
import com.prd.module.warehouse0.entity.InvMoveOrder;

public interface InvInventoryDAO {

    /**缺少对item_spec条件的限制
     *
     * 入库时 根据InvMoveOrder 查询InvInventory
     *
     * @param invMoveOrder
     * @return  InvInventory
     */
    InvInventory selectInvInventoryByInvMoveOrder(InvMoveOrder invMoveOrder);


    /**
     * 出库时 根据InvMoveOrder 查询InvInventory
     * @param invMoveOrder
     * @return
     */
    InvInventory selectInvInventoryByInvMoveOrder2(InvMoveOrder invMoveOrder);


    /**
     * 根据InvInventory 更新
     *
     * @param invInventory
     * @return
     */

    int updateInvInventoryBySelf(InvInventory invInventory);


    int deleteByPrimaryKey(String id);

    int insert(InvInventory record);

    int insertSelective(InvInventory record);

    int updateByPrimaryKeySelective(InvInventory record);

    int updateByPrimaryKey(InvInventory record);


}