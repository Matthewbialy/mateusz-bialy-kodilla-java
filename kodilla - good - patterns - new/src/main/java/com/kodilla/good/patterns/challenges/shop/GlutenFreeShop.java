package com.kodilla.good.patterns.challenges.shop;

public class GlutenFreeShop implements Shop {

    private String nameOfSupplier;
    private String productType;
    private int productQuanity;


    public GlutenFreeShop(final String nameOfSupplier, final String productType, final int productQuanity) {
        this.nameOfSupplier = nameOfSupplier;
        this.productType = productType;
        this.productQuanity = productQuanity;
    }

    public String getNameOfSupplier() {
        return nameOfSupplier;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductQuanity() {
        return productQuanity;
    }

    @Override
    public void processOrder() {

    }


}
