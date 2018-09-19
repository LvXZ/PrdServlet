package com.prd.module.warehouse.entity;

import java.util.Date;

public class InvSerialRecord {
    private Long id;

    private Long itemId;

    private Byte serialType;

    private String serialNo;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Byte getSerialType() {
        return serialType;
    }

    public void setSerialType(Byte serialType) {
        this.serialType = serialType;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }
}