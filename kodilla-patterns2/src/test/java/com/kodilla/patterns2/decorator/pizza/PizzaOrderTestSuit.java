package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuit {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Your ordered pizza", description);
    }

    @Test
    public void testBasicPizzaWithCalzoneDoubleCheeseAndHam() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CalzoneDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(22), calculatedCost);
    }

}
