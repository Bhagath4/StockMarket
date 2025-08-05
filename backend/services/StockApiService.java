package com.stockpulse.backend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockApiService {
    @Value("${stock.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    // Example method to fetch stock data from Alpha Vantage (not used in dummy data)
    public String fetchStockData(String symbol) {
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=" + symbol + "&apikey=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}
