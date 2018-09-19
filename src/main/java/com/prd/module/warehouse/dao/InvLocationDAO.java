package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvLocation;

public interface InvLocationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvLocation record);

    int insertSelective(InvLocation record);

    InvLocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvLocation record);

    int updateByPrimaryKey(InvLocation record);
}