package com.kodilla.testing.collection;

public class Triangle implements Shape.Shape {

    double b = 3.0;
    double h = 1.5;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public String getName2() {
        return "Triangle";
    }

    @Override
    public double getField2() {

        return Math.atan2(b*h) / 2 ;
    }
}
