package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public  double nextDivide() {
    try {
        double result = divide(3.0, 0.0);
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }finally {
       System.out.println("Everything is ok!");
       return nextDivide();
    }

    }
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.nextDivide();

        System.out.println(result);

    }
}