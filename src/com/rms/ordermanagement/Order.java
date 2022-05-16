package com.rms.ordermanagement;

import com.rms.entities.IngredientQuantity;
import com.rms.entities.OrderCategory;

import java.util.List;
import java.util.UUID;

public class Order {
    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OrderCategory getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(OrderCategory orderCategory) {
        this.orderCategory = orderCategory;
    }

    public List<IngredientQuantity> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<IngredientQuantity> orderDetails) {
        this.orderDetails = orderDetails;
    }

    UUID orderId;
    double amount;
    OrderCategory orderCategory;
    List<IngredientQuantity> orderDetails;
}