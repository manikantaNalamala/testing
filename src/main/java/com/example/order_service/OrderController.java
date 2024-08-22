package com.example.order_service;


import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final String ORDER_SERVICE = "orderservice";
    private int attempt = 0;

    @Autowired
    private OrderService orderService;


    @GetMapping()
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderService.getOrderbyId(id);
    }


    @GetMapping("/getProduct/{productId}")
    public Order getOrderByProductId(@PathVariable String productId) {
        return orderService.getOrderByProductId(productId);
    }

    // @CircuitBreaker(name = ORDER_SERVICE, fallbackMethod = "getAvilablemethods")
    @Retry(name = ORDER_SERVICE, fallbackMethod = "getAvilablemethods")
    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        System.out.println("Attempt no " + attempt++ + "at " + new Date());
        return orderService.addOrder(order);
    }

    public Order getAvilablemethods(Exception e) {
        Order order = new Order("123456", "ABCDE", 123);
        return order;
    }

}
