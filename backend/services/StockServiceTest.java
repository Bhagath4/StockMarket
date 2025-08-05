package com.stockpulse.backend.services;

import com.stockpulse.backend.models.Stock;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {
    @Test
    void testGetStocks() {
        StockService service = new StockService();
        List<Stock> stocks = service.getStocks(90);
        assertEquals(3, stocks.size());
        assertEquals("AAPL", stocks.get(0).getSymbol());
    }
}
