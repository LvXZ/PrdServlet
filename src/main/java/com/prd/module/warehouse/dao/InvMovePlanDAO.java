package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvMovePlan;

public interface InvMovePlanDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvMovePlan record);

    int insertSelective(InvMovePlan record);

    InvMovePlan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvMovePlan record);

    int updateByPrimaryKey(InvMovePlan record);
}