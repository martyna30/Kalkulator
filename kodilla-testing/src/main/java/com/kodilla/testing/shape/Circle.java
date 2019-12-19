package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    @Override
    public void getShapeName() {
        System.out.println("Circle");
    }
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
