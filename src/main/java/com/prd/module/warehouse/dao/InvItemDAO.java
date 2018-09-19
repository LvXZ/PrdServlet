package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvItem;

public interface InvItemDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvItem record);

    int insertSelective(InvItem record);

    InvItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvItem record);

    int updateByPrimaryKey(InvItem record);
}