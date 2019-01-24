package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public void displayValue(double val){display.displayValue(val);}

    double add(double a, double b) {
        return display.displayValue(a + b);
    }

    double sub(double a, double b) {
        return display.displayValue(a - b);
    }

    double mul(double a, double b) {
        return display.displayValue(a * b);
    }

    double div(double a, double b) {
        return display.displayValue(a / b);
    }

}
