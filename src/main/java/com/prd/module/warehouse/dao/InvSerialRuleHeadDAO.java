package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvSerialRuleHead;

public interface InvSerialRuleHeadDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvSerialRuleHead record);

    int insertSelective(InvSerialRuleHead record);

    InvSerialRuleHead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvSerialRuleHead record);

    int updateByPrimaryKey(InvSerialRuleHead record);
}