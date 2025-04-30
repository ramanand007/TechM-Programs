package com.ecommerce.example;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.example.Order;
import com.ecommerce.example.OrderService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return service.placeOrder(order);
    }
}
