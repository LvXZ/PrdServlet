package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvTransactionType;

public interface InvTransactionTypeDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvTransactionType record);

    int insertSelective(InvTransactionType record);

    InvTransactionType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvTransactionType record);

    int updateByPrimaryKey(InvTransactionType record);
}