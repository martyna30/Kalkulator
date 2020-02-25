package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop extends Supplier {

    public GlutenFreeShop(int index, String name) {
        super(index, name);
    }

    @Override
    double addComplimentaryProduct(Product product) {
        return product.addComplimentaryProduct();
    }

    @Override
    void process() {
        System.out.println("You receive e-mail");
    }
    @Override
    List<Product> listProducts() {
        List<Product> productsForGlutenFreeShop = new ArrayList<>();
        productsForGlutenFreeShop.add(new Product(0, 13, 12, "Gluten free pasta"));
        return productsForGlutenFreeShop;
    }
}
