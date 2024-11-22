package com.example.order_calculator;

import com.example.order_calculator.entities.Order;
import com.example.order_calculator.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderCalculatorApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(OrderCalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.00, 20.0);
        Integer id = order.getCode();
        double total = orderService.total(order);
        System.out.printf("Pedido código %d, total: R$ %.2f%n", id, total);
        Order order2 = new Order(2282, 800.00, 10.0);
        Integer id2 = order2.getCode();
        double total2 = orderService.total(order2);
        System.out.printf("Pedido código %d, total: R$ %.2f%n", id2, total2);
        Order order3 = new Order(1308, 95.90, 0.0);
        Integer id3 = order3.getCode();
        double total3 = orderService.total(order3);
        System.out.printf("Pedido código %d, total: R$ %.2f%n", id3, total3);

    }
}
