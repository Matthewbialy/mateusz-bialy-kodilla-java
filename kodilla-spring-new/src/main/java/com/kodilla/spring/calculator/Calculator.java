package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public void displayValue(double val) {
        display.displayValue(val);
    }

    double add(double a, double b) {
       double result = a + b;
       return result;
    }

    double sub(double a, double b){
        double result2 = a - b;
        return result2;
    }

    double mul(double a, double b){
        double result3 = a * b;
        return result3;
    }

    double div(double a, double b) {
        double result4 = a / b;
        return result4;

    }


}
