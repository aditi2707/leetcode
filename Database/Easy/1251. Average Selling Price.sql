-- Write your MySQL query statement below
SELECT p.product_id, ROUND(IFNULL(SUM(p.price * u.units) / SUM(u.units), 0), 2) AS average_price
FROM Prices AS p LEFT JOIN UnitsSold AS u
ON p.product_id = u.product_id
WHERE u.purchase_date >= p.start_date AND u.purchase_date <= p.end_date 
OR u.purchase_date IS NULL
GROUP BY p.product_id
