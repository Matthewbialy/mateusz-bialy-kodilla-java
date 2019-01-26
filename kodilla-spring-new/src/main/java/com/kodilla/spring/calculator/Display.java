package com.kodilla.spring.calculator;


import org.springframework.stereotype.Component;

@Component
public class Display {

    private Calculator calculator;

    public void displayValue(double val){
        System.out.println(val);
    }

    public void displayResult() {
        System.out.println("add value:" + calculator.add(6,6) + "div value:" + calculator.div(6, 6) + "mul value:" +
                calculator.mul(6,6) +"sub value:" + calculator.sub(6,6));
    }
}

