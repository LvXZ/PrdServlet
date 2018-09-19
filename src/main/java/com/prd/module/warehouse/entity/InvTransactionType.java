package com.prd.module.warehouse.entity;

import java.util.Date;

public class InvTransactionType {
    private Long id;

    private String transType;

    private String transCode;

    private String transName;

    private String transFlow;

    private Byte isUserDefined;

    private Byte isEnabled;

    private Date disabledTime;

    private String attribute;

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

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public String getTransFlow() {
        return transFlow;
    }

    public void setTransFlow(String transFlow) {
        this.transFlow = transFlow;
    }

    public Byte getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(Byte isUserDefined) {
        this.isUserDefined = isUserDefined;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getDisabledTime() {
        return disabledTime;
    }

    public void setDisabledTime(Date disabledTime) {
        this.disabledTime = disabledTime;
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