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
        double amount = order.getAmount();
        double discount = discountService.discount(amount, order.getDiscount());
        double shipping = shippingService.shipping(amount);
        return amount + shipping - discount;
    }

}
