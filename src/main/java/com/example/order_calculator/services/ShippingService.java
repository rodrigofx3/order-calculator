package com.example.order_calculator.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipping(double basic) {
        if (basic < 100.0) {
            return 20.0;
        } else if (basic < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}