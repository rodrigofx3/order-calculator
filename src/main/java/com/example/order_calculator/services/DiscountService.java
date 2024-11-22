package com.example.order_calculator.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double discount(double amount, double percentage) {
        return amount * percentage / 100;
    }
}
