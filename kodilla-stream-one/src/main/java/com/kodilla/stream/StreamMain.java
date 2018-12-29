package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {
    public static void main(String [] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String result = poemBeautifier.beautify("ABC" + " " + "TeXt to decorate" + " " + "ABC",(a)->a.toLowerCase());
        System.out.println(result);

        String result1 = poemBeautifier.beautify("Text to change",(b)->b.toUpperCase());
        System.out.println(result1);

        String result2 = poemBeautifier.beautify("Another text to decorate",(c)->c.substring(5));
        System.out.println(result2);

        System.out.println("USing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}
