package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;
    private double val;

    public double add(double a, double b) {
        val = a + b;
        return display.displayValue(val);
    }

    public double sub(double a, double b) {
        val = a - b;
        return display.displayValue(val);
    }

    public double mul(double a, double b){
        val = a * b;
        return display.displayValue(val);
    }

    public double div(double a, double b){
        val = a / b;
        return display.displayValue(val);
    }
}
