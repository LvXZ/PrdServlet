package com.prd.module.warehouse.entity;

import java.util.Date;

public class InvSpecHead {
    private Long id;

    private Integer specNo;

    private Byte specStatus;

    private String specName;

    private Long itemId;

    private Long unitId;

    private String attribute;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSpecNo() {
        return specNo;
    }

    public void setSpecNo(Integer specNo) {
        this.specNo = specNo;
    }

    public Byte getSpecStatus() {
        return specStatus;
    }

    public void setSpecStatus(Byte specStatus) {
        this.specStatus = specStatus;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
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