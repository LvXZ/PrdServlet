package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvTransactionType;

public interface InvTransactionTypeDAO {

    /**
     * 根据id 查询InvTransactionType
     * @param id
     * @return
     */
    InvTransactionType selectInvTransactionTypeByID(String id);


    int deleteByPrimaryKey(String id);

    int insert(InvTransactionType record);

    int insertSelective(InvTransactionType record);


    int updateByPrimaryKeySelective(InvTransactionType record);

    int updateByPrimaryKey(InvTransactionType record);
}