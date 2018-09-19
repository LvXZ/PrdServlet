package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvSerialRecord;

public interface InvSerialRecordDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvSerialRecord record);

    int insertSelective(InvSerialRecord record);

    InvSerialRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvSerialRecord record);

    int updateByPrimaryKey(InvSerialRecord record);
}