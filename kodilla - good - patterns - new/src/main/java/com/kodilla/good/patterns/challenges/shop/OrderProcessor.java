package com.kodilla.good.patterns.challenges.shop;

public class OrderProcessor {

    private ExtraFoodShop extraFoodShop;
    private HealthyShop healthyShop;
    private GlutenFreeShop glutenFreeShop;


    public OrderProcessor(final ExtraFoodShop extraFoodShop, final HealthyShop healthyShop, final GlutenFreeShop glutenFreeShop) {
        this.extraFoodShop = extraFoodShop;
        this.healthyShop = healthyShop;
        this.glutenFreeShop = glutenFreeShop;

    }


    public boolean process(String shopKind) {

        Shop shop = null;
        if (shopKind.equals("HealthyShop")) {
            shop = new HealthyShop("HealthyShop", "HealthyFood", 5);
        } else if (shopKind.equals("ExtraFoodShop")) {
            shop = new ExtraFoodShop("ExtraShop", "ExtraFood", 4);
        } else if (shopKind.equals("GlutenFreeShop")) {
            shop = new GlutenFreeShop("GlutenFreeShop", "No Gluten", 4);
        }
        shop.processOrder();
        return true;
    }

}

