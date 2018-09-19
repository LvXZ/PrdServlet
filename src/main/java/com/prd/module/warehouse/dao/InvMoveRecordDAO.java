package com.prd.module.warehouse.dao;

import com.prd.module.warehouse.entity.InvMoveRecord;

public interface InvMoveRecordDAO {
    int deleteByPrimaryKey(Long id);

    int insert(InvMoveRecord record);

    int insertSelective(InvMoveRecord record);

    InvMoveRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InvMoveRecord record);

    int updateByPrimaryKey(InvMoveRecord record);
}