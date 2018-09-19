package com.prd.module.warehouse0.dao;

import com.prd.module.warehouse0.entity.InvWarehouse;

public interface InvWarehouseDAO {

    /**
     * 根据 id 查询 InvWarehouse
     * @param id
     * @return
     */
    InvWarehouse selectInvWarehouseByID(String id);





    int deleteByPrimaryKey(String id);

    int insert(InvWarehouse record);

    int insertSelective(InvWarehouse record);



    int updateByPrimaryKeySelective(InvWarehouse record);

    int updateByPrimaryKey(InvWarehouse record);
}