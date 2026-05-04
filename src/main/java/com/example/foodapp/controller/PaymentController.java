package com.example.foodapp.controller;

import com.example.foodapp.model.Order;
import com.example.foodapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {

    @Autowired
    private OrderRepository orderRepository;

    // ✅ SAVE ORDER
    @PostMapping("/create-order")
    public Order createOrder(@RequestBody Map<String, Object> data) {

        int amount = (int) data.get("amount");

        Order order = new Order();
        order.setAmount(amount);
        order.setStatus("SUCCESS");

        return orderRepository.save(order);
    }

    // ✅ GET ALL ORDERS
    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}