package com.prd.module.warehouse.entity;

import java.util.Date;

public class InvWarehouse {
    private Long id;

    private String warehouseCode;

    private String warehouseName;

    private Byte isLocationEnabled;

    private Byte isMrpEnabled;

    private Long orgId;

    private String attribute;

    private Byte isEnabled;

    private Byte isDeleted;

    private Date createTime;

    private Long createId;

    private Date modifiedTime;

    private Long modifiedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Byte getIsLocationEnabled() {
        return isLocationEnabled;
    }

    public void setIsLocationEnabled(Byte isLocationEnabled) {
        this.isLocationEnabled = isLocationEnabled;
    }

    public Byte getIsMrpEnabled() {
        return isMrpEnabled;
    }

    public void setIsMrpEnabled(Byte isMrpEnabled) {
        this.isMrpEnabled = isMrpEnabled;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Long getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(Long modifiedId) {
        this.modifiedId = modifiedId;
    }
}