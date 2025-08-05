// Sample dummy data for testing
const stocks = [
    { symbol: 'AAPL', name: 'Apple Inc.', price: 180, profitLoss: 12, risk: 'Moderate', age: 5000 },
    { symbol: 'GOOGL', name: 'Alphabet Inc.', price: 2700, profitLoss: -30, risk: 'Low', age: 7000 },
    { symbol: 'TSLA', name: 'Tesla Inc.', price: 700, profitLoss: 50, risk: 'High', age: 4000 }
];

function renderDashboard() {
    const dashboard = document.getElementById('dashboard');
    dashboard.innerHTML = '';
    stocks.forEach(stock => {
        const card = document.createElement('div');
        card.className = 'stock-card';
        card.innerHTML = `
            <h2>${stock.name} (${stock.symbol})</h2>
            <p>Current Price: $${stock.price}</p>
            <p>Profit/Loss (90d): $${stock.profitLoss}</p>
            <p>Risk Level: ${stock.risk}</p>
            <p>Stock Age: ${stock.age} days</p>
            <canvas id="chart-${stock.symbol}"></canvas>
        `;
        dashboard.appendChild(card);
        // Chart.js sample chart
        new Chart(document.getElementById(`chart-${stock.symbol}`), {
            type: 'line',
            data: {
                labels: Array.from({length: 10}, (_, i) => `Day ${i+1}`),
                datasets: [{
                    label: 'Price',
                    data: Array.from({length: 10}, () => stock.price + Math.random()*10-5),
                    borderColor: 'blue',
                    fill: false
                }]
            }
        });
    });
}

// Auto-update every minute
setInterval(renderDashboard, 60000);
renderDashboard();
