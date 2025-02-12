-- Write your MySQL query statement below
SELECT s.stock_name, (s.sell - b.buy) AS capital_gain_loss
FROM
    ((SELECT stock_name, SUM(price) AS sell
    FROM Stocks
    WHERE operation = "Sell"
    GROUP BY stock_name) AS s
    JOIN
    (SELECT stock_name, SUM(price) AS buy
    FROM Stocks
    WHERE operation = "Buy"
    GROUP BY stock_name) AS b
    ON s.stock_name = b.stock_name
    )
