package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Supplier {

    public HealthyShop(int index, String name) {
        super(index, name);
    }

    @Override
    double addComplimentaryProduct(Product product) {
        return product.getQuantity();

    }

    @Override
    void process() {
        System.out.println("You receive discount!");
    }

    @Override
    List<Product> listProducts() {
        final List<Product> productsForHealthyShop = new ArrayList<>();
        productsForHealthyShop.add(new Product(0,20,14,"buckwheat noodles"));
        return productsForHealthyShop;
    }
}
