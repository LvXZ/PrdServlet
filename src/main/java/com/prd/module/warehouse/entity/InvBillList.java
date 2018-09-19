package com.prd.module.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvBillList {
    private Long id;

    private Long billId;

    private Integer lineNo;

    private Byte orderType;

    private String orderNo;

    private Long itemId;

    private BigDecimal listQuantity;

    private BigDecimal execQuantity;

    private Long specId;

    private String serialNo;

    private Long sourceWarehouseId;

    private Long sourceLocationId;

    private Long destWarehouseId;

    private Long destLocationId;

    private String attribute;

    private Date createTime;

    private Long createId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getListQuantity() {
        return listQuantity;
    }

    public void setListQuantity(BigDecimal listQuantity) {
        this.listQuantity = listQuantity;
    }

    public BigDecimal getExecQuantity() {
        return execQuantity;
    }

    public void setExecQuantity(BigDecimal execQuantity) {
        this.execQuantity = execQuantity;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
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