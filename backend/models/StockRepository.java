package com.stockpulse.backend.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
    // Custom queries can be added here
}
