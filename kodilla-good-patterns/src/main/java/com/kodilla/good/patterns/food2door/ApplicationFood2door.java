package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFood2door {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(1,"ExtraFoodShop");

        Order order = new Order(new OrderService() {
                @Override
                public boolean order(Supplier supplier, Product product) {
                    return true;
                }
        });

        Supplier selectedSupplier = extraFoodShop;

        Product selectedProducts = extraFoodShop.listProducts().get(0);

        boolean isOrdered = order.orderService.order(selectedSupplier, selectedProducts);

        if(isOrdered) {
            System.out.println("You chose supplier " + selectedSupplier.getName());
            System.out.println("You have ordered product "+ selectedProducts.getName() + " in the amount " +  selectedProducts.addComplimentaryProduct());

            selectedSupplier.process();

            System.out.println("Order has been accepted for completion");
        } else {
            System.out.println("Order hasn't been accepted for completion");
        }
    }
}
