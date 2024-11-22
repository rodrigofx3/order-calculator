package com.example.order_calculator.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double discount(double basic, double discount) {
        return basic * discount / 100;
    }
}
