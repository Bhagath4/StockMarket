# StockPulse

A Java Spring Boot + React dashboard for real-time stock analytics.

## Features
- Real-time stock data (Alpha Vantage/Twelve Data API)
- Profit/Loss calculation (adjustable time range)
- Risk analysis (Low/Moderate/High)
- Stock age since IPO
- Interactive dashboard (Chart.js)
- Local H2 DB caching
- Automated build/test/migration workflows
- Monitoring dashboard (Spring Boot Actuator)

## Setup
1. Clone repo
2. Get a free API key from [Alpha Vantage](https://www.alphavantage.co/support/#api-key) or [Twelve Data](https://twelvedata.com/signup)
3. Set your API key in `resources/application.properties`:
   ```
   stock.api.key=YOUR_API_KEY_HERE
   ```
4. Build backend:
   ```
   cd backend
   mvn clean install
   ```
5. Run backend:
   ```
   mvn spring-boot:run
   ```
6. Run frontend:
   ```
   cd ../frontend
   npx serve .
   ```
7. Access dashboard at [http://localhost:8080](http://localhost:8080)

## Automated Workflows
- Build: Maven
- DB migration: Flyway
- Test: JUnit
- Monitoring: Spring Boot Actuator

## Sample Data
Dummy data is used for initial testing. Replace with live API data by configuring your API key.
