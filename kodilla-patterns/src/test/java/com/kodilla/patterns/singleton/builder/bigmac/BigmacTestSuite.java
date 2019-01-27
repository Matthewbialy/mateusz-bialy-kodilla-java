package com.kodilla.patterns.singleton.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .ingredient("Salad")
                .ingredient("Onion")
                .ingredient("Mushroms")
                .ingredient("Cheese")
                .souce("Spicy")
                .bun("roll")
                .burgers(1)
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
