package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvBillHead;

public interface InvBillHeadDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvBillHead record);

    int insertSelective(InvBillHead record);

    InvBillHead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvBillHead record);

    int updateByPrimaryKey(InvBillHead record);
}