package com.kodilla.spring.shape;


import org.springframework.stereotype.Component;

@Component   //na podstawie adnotacji tworze kontener Beanów(obiektów klas z tą adnotacją)
public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "This is a circle";
    }
}
