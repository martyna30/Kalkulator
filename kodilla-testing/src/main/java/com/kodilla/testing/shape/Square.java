package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private double b;
    Shape squere;

    public Square(){};

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void getShapeName() {
        System.out.println("Square");
    }
    @Override
    public double getField() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Square";
    }
}


