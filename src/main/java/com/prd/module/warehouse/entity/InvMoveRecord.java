package com.prd.module.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvMoveRecord {
    private Long id;

    private String recordNo;

    private Byte recordStatus;

    private Long transId;

    private Long itemId;

    private Byte orderType;

    private String orderNo;

    private Long sourceWarehouseId;

    private Long sourceLocationId;

    private Long destWarehouseId;

    private Long destLocationId;

    private BigDecimal quantity;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public Byte getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Byte recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getSourceWarehouseId() {
        return sourceWarehouseId;
    }

    public void setSourceWarehouseId(Long sourceWarehouseId) {
        this.sourceWarehouseId = sourceWarehouseId;
    }

    public Long getSourceLocationId() {
        return sourceLocationId;
    }

    public void setSourceLocationId(Long sourceLocationId) {
        this.sourceLocationId = sourceLocationId;
    }

    public Long getDestWarehouseId() {
        return destWarehouseId;
    }

    public void setDestWarehouseId(Long destWarehouseId) {
        this.destWarehouseId = destWarehouseId;
    }

    public Long getDestLocationId() {
        return destLocationId;
    }

    public void setDestLocationId(Long destLocationId) {
        this.destLocationId = destLocationId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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