package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvSerialInfo;

public interface InvSerialInfoDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvSerialInfo record);

    int insertSelective(InvSerialInfo record);

    InvSerialInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvSerialInfo record);

    int updateByPrimaryKey(InvSerialInfo record);
}