package com.kodilla.testing.calculator;


public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.substractAFromB(5, 3);
        int expected = 2;

        if (expected == result) {
            System.out.println("test OK");
        }else{
            System.out.println("Error");
        }

        int result1 = calculator.addAtoB(5, 3);
        int expected1 = 8;

        if (expected1 == result1) {
            System.out.println("Test OK");
        }else{
            System.out.println("error");
        }
    }
}
