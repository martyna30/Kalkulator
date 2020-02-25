package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class PysznePL extends Supplier {
    private final List<Product> productsForPysznePl = new ArrayList<>();

    public PysznePL(int index, String name) {
        super(index, name);
    }

    @Override
    List<Product> listProducts() {
        productsForPysznePl.add(new Product(0, 4, 24, "Hamburger"));
        productsForPysznePl.add(new Product(1, 14, 42, "beef with rice"));
        return productsForPysznePl;
    }

    @Override
    double addComplimentaryProduct(Product product) {
        return product.getQuantity();
    }
    @Override
    public void process() {
        if (productsForPysznePl.get(0).getQuantity() == 2) {
            System.out.println("You receive chips for free gift!");
        }
    }
}


