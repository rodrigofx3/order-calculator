package com.example.order_calculator.entities;

public class Order {
    private Integer id;
    private Double amount;
    private Double discount;

    public Order() {
    }

    public Order(Integer id, Double total, Double discount) {
        this.id = id;
        this.amount = total;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
