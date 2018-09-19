package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvInventory;

public interface InvInventoryDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvInventory record);

    int insertSelective(InvInventory record);

    InvInventory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvInventory record);

    int updateByPrimaryKey(InvInventory record);
}