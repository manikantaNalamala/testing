package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    private int attempt = 1;

    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();

    }

    public Order getOrderbyId(String id) {
        return orderRepository.findById(id).orElse(null);

    }

    public Order addOrder(Order order) {
       // System.out.println("Attempt no " + attempt++ + "at" + new Date());
        Product product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("product not found");
        }

    }

    public Order getOrderByProductId(String productId) {
        return orderRepository.findOrderByProductId(productId);
    }
}
