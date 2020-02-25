package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop extends Supplier {
    Order order;

    public ExtraFoodShop(int index, String name) {
        super(index, name);
    }

    @Override
    double addComplimentaryProduct(Product product) {
        return product.addComplimentaryProduct();
    }

    @Override
    public void process() {
        System.out.println("If you ordered minimum ten products, you receive one product for free gift!");
    }
    @Override
    List<Product> listProducts() {
        final List<Product> productsListForExtraFoodShop = new ArrayList<>();
        productsListForExtraFoodShop.add(new Product(0,10,6,"butter"));
        productsListForExtraFoodShop.add(new Product(1,9,9,"beetroot"));
        return productsListForExtraFoodShop;
    }
}
