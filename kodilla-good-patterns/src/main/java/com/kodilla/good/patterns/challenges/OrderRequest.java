package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDate;
    private LocalDateTime supplyDate;

    public OrderRequest(User user, LocalDateTime orderDate, LocalDateTime supplyDate) {
        this.user = user;
        this.orderDate = orderDate;
        this.supplyDate = supplyDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getSupplyDate() {
        return supplyDate;
    }
}
