package com.example.order_calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderCalculatorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderCalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Hello World!");


    }
}
