package com.stockpulse.backend.services;

import org.springframework.stereotype.Service;

@Service
public class RiskAnalyzer {
    // Dummy risk analysis based on volatility and return rates
    public String analyzeRisk(double[] prices) {
        // Simple volatility calculation
        double mean = 0;
        for (double p : prices) mean += p;
        mean /= prices.length;
        double variance = 0;
        for (double p : prices) variance += Math.pow(p - mean, 2);
        variance /= prices.length;
        double volatility = Math.sqrt(variance);
        if (volatility < 10) return "Low";
        if (volatility < 30) return "Moderate";
        return "High";
    }
}
