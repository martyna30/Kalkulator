package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

ArrayList<Shape>listShape = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.listShape.remove(shape);
    }

    public void getFigure(int n) {
        this.listShape.get(n);
    }
}






