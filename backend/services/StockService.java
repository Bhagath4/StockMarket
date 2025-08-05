package com.stockpulse.backend.services;

import com.stockpulse.backend.models.Stock;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class StockService {
    // Dummy data for testing
    public List<Stock> getStocks(int days) {
        return Arrays.asList(
            createStock("AAPL", "Apple Inc.", 180, 12, "Moderate", LocalDate.of(2010, 1, 1)),
            createStock("GOOGL", "Alphabet Inc.", 2700, -30, "Low", LocalDate.of(2004, 8, 19)),
            createStock("TSLA", "Tesla Inc.", 700, 50, "High", LocalDate.of(2010, 6, 29))
        );
    }
    private Stock createStock(String symbol, String name, double price, double profitLoss, String risk, LocalDate ipoDate) {
        Stock s = new Stock();
        s.setSymbol(symbol);
        s.setName(name);
        s.setPrice(price);
        s.setProfitLoss(profitLoss);
        s.setRisk(risk);
        s.setIpoDate(ipoDate);
        s.setAge((int) java.time.temporal.ChronoUnit.DAYS.between(ipoDate, LocalDate.now()));
        return s;
    }
}
