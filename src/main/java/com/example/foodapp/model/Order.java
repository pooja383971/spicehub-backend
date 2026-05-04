package com.example.foodapp.model;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int amount;
    private String status;

    // getters and setters
    public Long getId() { return id; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}