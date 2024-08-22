package com.example.order_service;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "order_table")
public class Order {


    @Id
    private String id = UUID.randomUUID().toString();
    private String productId;
    private int quantity;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Order(String id, String productId, int quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }
    public Order(){

    }
}
