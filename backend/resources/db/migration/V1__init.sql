-- Flyway migration: create Stock table
CREATE TABLE IF NOT EXISTS stock (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    symbol VARCHAR(10),
    name VARCHAR(100),
    price DOUBLE,
    profit_loss DOUBLE,
    risk VARCHAR(20),
    age INT,
    ipo_date DATE
);
