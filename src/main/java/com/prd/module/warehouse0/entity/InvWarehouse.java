package com.prd.module.warehouse0.entity;

import java.util.Date;

public class InvWarehouse {
    private String id;

    private String whNo;

    private String whName;

    private Integer locatorControlFlag;

    private Integer entryMrpFlag;

    private String orgId;

    private String attribute;

    private Date createDate;

    private String createBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWhNo() {
        return whNo;
    }

    public void setWhNo(String whNo) {
        this.whNo = whNo;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName;
    }

    public Integer getLocatorControlFlag() {
        return locatorControlFlag;
    }

    public void setLocatorControlFlag(Integer locatorControlFlag) {
        this.locatorControlFlag = locatorControlFlag;
    }

    public Integer getEntryMrpFlag() {
        return entryMrpFlag;
    }

    public void setEntryMrpFlag(Integer entryMrpFlag) {
        this.entryMrpFlag = entryMrpFlag;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}