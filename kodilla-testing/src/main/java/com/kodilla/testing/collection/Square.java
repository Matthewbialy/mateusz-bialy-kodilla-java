package com.kodilla.testing.collection;

public class Square implements Shape {

    double a;

    public Square(double a) {

        this.a = a;
    }

    @Override
    public String getName() {

        return "square";
    }

    @Override
    public double getField() {

        return Math.abs(a * a);
    }
}
