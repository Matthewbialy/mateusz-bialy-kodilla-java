package com.kodilla.good.patterns.challenges.auction;

public class OrderDto {

    private String userName;
    private String productName;
    private int quantity;

    public OrderDto(String userName, String productName, int quantity) {
        this.userName = userName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

}

