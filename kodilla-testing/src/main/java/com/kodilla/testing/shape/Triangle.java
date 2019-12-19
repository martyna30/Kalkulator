package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double a;
    private double h;

    public Triangle(){};

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }
    @Override
    public double getField() {
        return a * h / 2;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
