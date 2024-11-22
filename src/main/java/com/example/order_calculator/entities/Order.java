package com.example.order_calculator.entities;

public class Order {
    private Integer id;
    private Double total;
    private Double discount;

    public Order() {
    }

    public Order(Integer id, Double total, Double discount) {
        this.id = id;
        this.total = total;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
