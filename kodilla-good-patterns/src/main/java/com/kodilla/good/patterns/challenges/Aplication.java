package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Aplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService() {
            @Override
            public void inform(User user) {
                System.out.println("Order has been accepted for completion");
            }
        }, new OrderService() {
            @Override
            public boolean order(User user, LocalDateTime orderDate, LocalDateTime supplyDate) {
                return true;
            }
        },
                new OrderRepository() {
                    @Override
                    public boolean createOrder(User user, LocalDateTime orderDate, LocalDateTime supplyDate) {
                        return true;
                    }
                });

        productOrderService.process(orderRequest);
    }
}



