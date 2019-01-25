package com.kodilla.good.patterns.challenges.auction;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private ProductOrderService productOrderService;

    public OrderProcessor(final InformationService informationService,
                          final OrderRepository orderRepository,
                          final ProductOrderService productOrderService) {

        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productOrderService = productOrderService;
    }

    public boolean process(final OrderDto orderDto) {
        boolean isOrdered = productOrderService.order(orderDto.getUserName(), orderDto.getProductName(), orderDto.getQuantity());

        if (isOrdered) {
            informationService.inform(orderDto.getUserName());
            orderRepository.createOrder(orderDto.getUserName());
            orderDto.getProductName();

            return true;
        } else {
            return false;
        }
    }
}
