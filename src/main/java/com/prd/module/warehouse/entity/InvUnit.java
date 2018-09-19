package com.prd.module.warehouse.entity;

public class InvUnit {
    private Long id;

    private String unitName;

    private String attribute;

    private Byte isSystem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Byte getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Byte isSystem) {
        this.isSystem = isSystem;
    }
}