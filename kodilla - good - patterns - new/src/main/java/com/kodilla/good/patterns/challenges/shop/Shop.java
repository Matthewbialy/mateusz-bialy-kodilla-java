package com.kodilla.good.patterns.challenges.shop;

public class Shop {

    private HealthyShop healthyShop;
    private GlutenFreeShop glutenFreeShop;
    private ExtraFoodShop extraFoodShop;
    private String shopKind;

    public Shop(final String shopKind, final HealthyShop healthyShop, final GlutenFreeShop glutenFreeShop, final ExtraFoodShop extraFoodShop) {
        this.shopKind = shopKind;
        this.glutenFreeShop = glutenFreeShop;
        this.extraFoodShop = extraFoodShop;
        this.healthyShop = healthyShop;
    }

    public String getShopKind() {
        return shopKind;
    }

    public String process() {
        return shopKind;
    }
}
