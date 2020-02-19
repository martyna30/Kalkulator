package com.kodilla.good.patterns.food2door;

public class Product {
    private int index;
    private int quantity;
    private double price;
    private String name;

    public Product(int index, int quantity, double price, String nameProduct) {
        this.quantity = quantity;
        this.price = price;
        this.name = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int addComplimentaryProduct() {
        return this.getQuantity() + (this.getQuantity() >= 10 ? 1 : 0);
    }

    public int getIndex() {
        return index;
    }

}

