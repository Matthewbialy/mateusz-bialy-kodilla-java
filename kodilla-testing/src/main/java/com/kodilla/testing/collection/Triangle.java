package com.kodilla.testing.collection;

public class Triangle implements Shape {

    double b;
    double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getField() {

        return (b*h) / 2 ;
    }
}
