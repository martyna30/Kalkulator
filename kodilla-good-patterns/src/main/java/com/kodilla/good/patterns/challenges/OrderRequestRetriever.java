package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Marta", "Tomczak");

        LocalDateTime orderDate = LocalDateTime.of(2020,1,31,13,41);
        LocalDateTime supplyDate = LocalDateTime.of(2020, 2,3,12,00);

        return new OrderRequest(user, orderDate, supplyDate);
    }
}
