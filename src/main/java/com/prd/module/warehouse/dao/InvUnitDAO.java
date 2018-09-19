package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvUnit;

public interface InvUnitDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvUnit record);

    int insertSelective(InvUnit record);

    InvUnit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvUnit record);

    int updateByPrimaryKey(InvUnit record);
}