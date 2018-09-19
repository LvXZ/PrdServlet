package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvBillList;

public interface InvBillListDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvBillList record);

    int insertSelective(InvBillList record);

    InvBillList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvBillList record);

    int updateByPrimaryKey(InvBillList record);
}