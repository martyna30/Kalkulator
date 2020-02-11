package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order (User user, LocalDateTime orderDate, LocalDateTime supplyDate);
        //System.out.println("Product for: " + user.getName() + user.getSurname() + "bought from" + orderDate.toString() + "has the expected delivery time to" + supplyDate.toString());
       // return true;
}
