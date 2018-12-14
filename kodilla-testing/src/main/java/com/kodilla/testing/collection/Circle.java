package com.kodilla.testing.collection;

public class Circle implements Shape.Shape {

    double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI*radius*radius;
    }
}
