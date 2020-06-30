package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

ArrayList<Shape>listShape = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.listShape.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return this.listShape.remove(shape);
    }

    public Shape getFigure(int n) {
        return this.listShape.get(n);
    }
}






