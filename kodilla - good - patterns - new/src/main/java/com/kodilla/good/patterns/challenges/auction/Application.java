package com.kodilla.good.patterns.challenges.auction;

public class Application {

    public static void main(String[] args) {


        User user = new User("John", "wick");

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderRepository(), new ProductOrderService());
        OrderDto orderDto = new OrderDto("wally", "Ipad", 2);
        orderProcessor.process(orderDto);
    }
}

