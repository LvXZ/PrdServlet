package com.prd.module.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvSerialInfo {
    private Long id;

    private String tableName;

    private Long hid;

    private Long itemSpecId;

    private Byte serialType;

    private String serialNo;

    private BigDecimal availableQuantity;

    private BigDecimal execQuantity;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getItemSpecId() {
        return itemSpecId;
    }

    public void setItemSpecId(Long itemSpecId) {
        this.itemSpecId = itemSpecId;
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

    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(BigDecimal availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public BigDecimal getExecQuantity() {
        return execQuantity;
    }

    public void setExecQuantity(BigDecimal execQuantity) {
        this.execQuantity = execQuantity;
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