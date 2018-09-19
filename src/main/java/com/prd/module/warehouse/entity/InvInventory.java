package com.prd.module.warehouse.entity;

import java.math.BigDecimal;

public class InvInventory {
    private Long id;

    private Long itemId;

    private Long warehouseId;

    private Long locationId;

    private BigDecimal availableQuantity;

    private BigDecimal assignQuantity;

    private BigDecimal blockQuantity;

    private BigDecimal avgCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(BigDecimal availableQuantity) {
        this.availableQuantity = availableQuantity;
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