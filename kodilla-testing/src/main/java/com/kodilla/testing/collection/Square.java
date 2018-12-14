package com.kodilla.testing.collection;

public class Square implements Shape.Shape {

    double a = 5.0;

    public Square (double a){
        this.a = a;
    }

    @Override
    public String getName1() {
        return "square";
    }

    @Override
    public double getField1() {
        return Math.abs(a*a);
    }
}
