package com.prd.module.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvItem {
    private Long id;

    private String itemCode;

    private String itemName;

    private Byte itemType;

    private Byte itemGroup;

    private Long unitId;

    private Long defaultWarehouseId;

    private Long defaultLocationId;

    private Byte serialControl;

    private Byte specControl;

    private BigDecimal safeInventory;

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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Byte getItemType() {
        return itemType;
    }

    public void setItemType(Byte itemType) {
        this.itemType = itemType;
    }

    public Byte getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(Byte itemGroup) {
        this.itemGroup = itemGroup;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getDefaultWarehouseId() {
        return defaultWarehouseId;
    }

    public void setDefaultWarehouseId(Long defaultWarehouseId) {
        this.defaultWarehouseId = defaultWarehouseId;
    }

    public Long getDefaultLocationId() {
        return defaultLocationId;
    }

    public void setDefaultLocationId(Long defaultLocationId) {
        this.defaultLocationId = defaultLocationId;
    }

    public Byte getSerialControl() {
        return serialControl;
    }

    public void setSerialControl(Byte serialControl) {
        this.serialControl = serialControl;
    }

    public Byte getSpecControl() {
        return specControl;
    }

    public void setSpecControl(Byte specControl) {
        this.specControl = specControl;
    }

    public BigDecimal getSafeInventory() {
        return safeInventory;
    }

    public void setSafeInventory(BigDecimal safeInventory) {
        this.safeInventory = safeInventory;
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