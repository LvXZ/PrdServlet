package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvSpecHead;

public interface InvSpecHeadDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvSpecHead record);

    int insertSelective(InvSpecHead record);

    InvSpecHead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvSpecHead record);

    int updateByPrimaryKey(InvSpecHead record);
}