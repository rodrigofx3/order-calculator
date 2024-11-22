package com.example.order_calculator.entities;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double total, Double discount) {
        this.code = code;
        this.basic = total;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
