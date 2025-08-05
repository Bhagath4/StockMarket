package com.stockpulse.backend.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private String name;
    private double price;
    private double profitLoss;
    private String risk;
    private int age;
    private LocalDate ipoDate;

    // Getters and setters omitted for brevity
    // ...existing code...
}
