package com.kodilla.good.patterns.challenges.shop;

public class Aplication {

    public static void main(String[] args) {

    OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShop("ExtraShop", "ExtraFood", 3),
            new HealthyShop("HealthyShop", "HealthyFood", 3),
            new GlutenFreeShop("GlutenFreeShop", "GlutenFree", 5));

    orderProcessor.process("ExtraFoodShop");



    }
}

