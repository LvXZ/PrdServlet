package com.prd.module.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvMovePlan {
    private Long id;

    private String planNo;

    private Byte panStatus;

    private Date planExecTime;

    private Long transId;

    private Long itemId;

    private Byte orderType;

    private String orderNo;

    private Long sourceWarehouseId;

    private Long destWarehouseId;

    private BigDecimal quantity;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public Byte getPanStatus() {
        return panStatus;
    }

    public void setPanStatus(Byte panStatus) {
        this.panStatus = panStatus;
    }

    public Date getPlanExecTime() {
        return planExecTime;
    }

    public void setPlanExecTime(Date planExecTime) {
        this.planExecTime = planExecTime;
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

    public Long getDestWarehouseId() {
        return destWarehouseId;
    }

    public void setDestWarehouseId(Long destWarehouseId) {
        this.destWarehouseId = destWarehouseId;
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