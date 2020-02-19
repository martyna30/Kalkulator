package com.kodilla.good.patterns.food2door;

import java.util.List;

public abstract class Supplier {
    private String name;
    private int index;

    abstract double addComplimentaryProduct (Product product);

    abstract void process();

    public Supplier(int index, String name) {
        this.name = name;
    }

    abstract List<Product>listProducts();

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

}
