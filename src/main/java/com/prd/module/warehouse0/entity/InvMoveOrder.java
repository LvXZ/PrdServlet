package com.prd.module.warehouse0.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvMoveOrder {
    private String id;

    private String orderStatus;

    private String orderType;

    private String transId;

    private String itemId;

    private String sourceWhId;

    private String sourceLocaId;

    private String sourceOrderId;

    private String sourceOrgId;

    private String destWhId;

    private String destLocaId;

    private String destOrderId;

    private String destOrgId;

    private BigDecimal orderQuantity;

    private BigDecimal execQuantity;

    private String itemSpec;

    private String lotNo;

    private String serialNo;

    private String operateDepa;

    private String operateBy;

    private Date operateDate;

    private Date processDepa;

    private String processBy;

    private Date processDate;

    private String attribute;

    private String execBy;

    private Date execDate;

    private String execErrMsg;

    private String createBy;

    private Date createDate;

    private BigDecimal copr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getSourceWhId() {
        return sourceWhId;
    }

    public void setSourceWhId(String sourceWhId) {
        this.sourceWhId = sourceWhId;
    }

    public String getSourceLocaId() {
        return sourceLocaId;
    }

    public void setSourceLocaId(String sourceLocaId) {
        this.sourceLocaId = sourceLocaId;
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }

    public String getSourceOrgId() {
        return sourceOrgId;
    }

    public void setSourceOrgId(String sourceOrgId) {
        this.sourceOrgId = sourceOrgId;
    }

    public String getDestWhId() {
        return destWhId;
    }

    public void setDestWhId(String destWhId) {
        this.destWhId = destWhId;
    }

    public String getDestLocaId() {
        return destLocaId;
    }

    public void setDestLocaId(String destLocaId) {
        this.destLocaId = destLocaId;
    }

    public String getDestOrderId() {
        return destOrderId;
    }

    public void setDestOrderId(String destOrderId) {
        this.destOrderId = destOrderId;
    }

    public String getDestOrgId() {
        return destOrgId;
    }

    public void setDestOrgId(String destOrgId) {
        this.destOrgId = destOrgId;
    }

    public BigDecimal getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(BigDecimal orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public BigDecimal getExecQuantity() {
        return execQuantity;
    }

    public void setExecQuantity(BigDecimal execQuantity) {
        this.execQuantity = execQuantity;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getOperateDepa() {
        return operateDepa;
    }

    public void setOperateDepa(String operateDepa) {
        this.operateDepa = operateDepa;
    }

    public String getOperateBy() {
        return operateBy;
    }

    public void setOperateBy(String operateBy) {
        this.operateBy = operateBy;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Date getProcessDepa() {
        return processDepa;
    }

    public void setProcessDepa(Date processDepa) {
        this.processDepa = processDepa;
    }

    public String getProcessBy() {
        return processBy;
    }

    public void setProcessBy(String processBy) {
        this.processBy = processBy;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getExecBy() {
        return execBy;
    }

    public void setExecBy(String execBy) {
        this.execBy = execBy;
    }

    public Date getExecDate() {
        return execDate;
    }

    public void setExecDate(Date execDate) {
        this.execDate = execDate;
    }

    public String getExecErrMsg() {
        return execErrMsg;
    }

    public void setExecErrMsg(String execErrMsg) {
        this.execErrMsg = execErrMsg;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getCopr() {
        return copr;
    }

    public void setCopr(BigDecimal copr) {
        this.copr = copr;
    }
}