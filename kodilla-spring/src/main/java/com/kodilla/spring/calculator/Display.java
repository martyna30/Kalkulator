package com.kodilla.spring.calculator;


import org.springframework.stereotype.Component;

@Component
public class Display {
    private double val;

    public double displayValue(double val) {
        System.out.println(val);
        return val;
    }

    public double getVal() {
        return val;
    }
}
