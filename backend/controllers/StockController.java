package com.stockpulse.backend.controllers;

import com.stockpulse.backend.models.Stock;
import com.stockpulse.backend.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    // Get all stocks (dummy data for now)
    @GetMapping
    public List<Stock> getStocks(@RequestParam(required = false, defaultValue = "90") int days) {
        // Returns stocks with profit/loss for the last 'days' days
        return stockService.getStocks(days);
    }
}
