package com.kodilla.good.patterns.food2door;

public class Order {
    OrderService orderService;

    public Order(OrderService orderService) {
        this.orderService = orderService;
    }
}
