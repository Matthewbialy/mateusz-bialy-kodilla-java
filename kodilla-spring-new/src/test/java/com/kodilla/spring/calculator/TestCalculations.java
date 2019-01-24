package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCalculations {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(3, 3);
        //Then
        Assert.assertEquals(6, result, 0.001);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result1 = calculator.sub(6,6);
        //Then
        Assert.assertEquals(0, result1, 0.001);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result2 = calculator.mul(6,6);
        //Then
        Assert.assertEquals(36, result2, 0.001);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result3 = calculator.div(6,6);
        //Then
        Assert.assertEquals(1,result3, 0.001);
    }
}
