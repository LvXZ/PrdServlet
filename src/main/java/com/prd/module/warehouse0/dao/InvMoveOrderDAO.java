package com.prd.module.warehouse0.dao;

import com.prd.module.warehouse0.entity.InvMoveOrder;

public interface InvMoveOrderDAO {

    /**
     * 根据 id 从 inv_move_order 表格中查询InvMoveOrder
     * @param id
     * @return InvMoveOrder
     */
    InvMoveOrder selectInvMoveOrderById(String id);

    /**
     *
     * 根据形参invMoveOrder 的id 更新订单状态 orderStatus
     *
     * @param invMoveOrder
     * @return
     */
    int updateOrderStatusByID(InvMoveOrder invMoveOrder);







    int deleteByPrimaryKey(String id);

    int insert(InvMoveOrder record);

    int insertSelective(InvMoveOrder record);

    int updateByPrimaryKeySelective(InvMoveOrder record);

    int updateByPrimaryKey(InvMoveOrder record);
}