package com.prd.module.warehouse.entity;

import java.util.Date;

public class InvLocation {
    private Long id;

    private Long warehouseId;

    private String locationCode;

    private String locationName;

    private Byte locationType;

    private Byte isMrpEnabled;

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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Byte getLocationType() {
        return locationType;
    }

    public void setLocationType(Byte locationType) {
        this.locationType = locationType;
    }

    public Byte getIsMrpEnabled() {
        return isMrpEnabled;
    }

    public void setIsMrpEnabled(Byte isMrpEnabled) {
        this.isMrpEnabled = isMrpEnabled;
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