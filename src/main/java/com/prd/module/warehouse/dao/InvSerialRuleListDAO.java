package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvSerialRuleList;

public interface InvSerialRuleListDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvSerialRuleList record);

    int insertSelective(InvSerialRuleList record);

    InvSerialRuleList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvSerialRuleList record);

    int updateByPrimaryKey(InvSerialRuleList record);
}