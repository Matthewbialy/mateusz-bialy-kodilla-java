package com.kodilla.exception.test;

public final class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0, 3.0);
        } catch (Exception e) {
            System.out.println("problem has been gone...");
        } finally {
            System.out.println("Try - Catch - Finally - Succesfull");
        }
    }
}
