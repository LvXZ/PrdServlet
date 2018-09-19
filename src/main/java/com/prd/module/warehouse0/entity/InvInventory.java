package com.prd.module.warehouse0.entity;

import java.math.BigDecimal;

public class InvInventory {
    private String id;

    private String itemId;

    private String itemSpec;

    private String whId;

    private String locaId;

    private BigDecimal quantity;

    private BigDecimal assignQuantity;

    private BigDecimal blockQuantity;

    private BigDecimal avgCost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId;
    }

    public String getLocaId() {
        return locaId;
    }

    public void setLocaId(String locaId) {
        this.locaId = locaId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAssignQuantity() {
        return assignQuantity;
    }

    public void setAssignQuantity(BigDecimal assignQuantity) {
        this.assignQuantity = assignQuantity;
    }

    public BigDecimal getBlockQuantity() {
        return blockQuantity;
    }

    public void setBlockQuantity(BigDecimal blockQuantity) {
        this.blockQuantity = blockQuantity;
    }

    public BigDecimal getAvgCost() {
        return avgCost;
    }

    public void setAvgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
    }
}