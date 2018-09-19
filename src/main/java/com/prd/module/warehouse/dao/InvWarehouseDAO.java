package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvWarehouse;

public interface InvWarehouseDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvWarehouse record);

    int insertSelective(InvWarehouse record);

    InvWarehouse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvWarehouse record);

    int updateByPrimaryKey(InvWarehouse record);
}