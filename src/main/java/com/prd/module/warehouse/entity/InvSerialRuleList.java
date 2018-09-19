package com.prd.module.warehouse.entity;

public class InvSerialRuleList {
    private Long id;

    private Long hid;

    private Integer colNo;

    private Byte colType;

    private String colValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Integer getColNo() {
        return colNo;
    }

    public void setColNo(Integer colNo) {
        this.colNo = colNo;
    }

    public Byte getColType() {
        return colType;
    }

    public void setColType(Byte colType) {
        this.colType = colType;
    }

    public String getColValue() {
        return colValue;
    }

    public void setColValue(String colValue) {
        this.colValue = colValue;
    }
}