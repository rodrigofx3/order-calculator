package com.example.order_calculator.services;

import com.example.order_calculator.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    @Autowired
    private DiscountService discountService;

    public double total(Order order) {
        double basic = order.getBasic();
        double discount = discountService.discount(basic, order.getDiscount());
        double shipping = shippingService.shipping(basic);
        return basic + shipping - discount;
    }

}
