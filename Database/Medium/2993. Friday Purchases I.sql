-- Write your MySQL query statement below
SELECT (WEEK(purchase_date) - WEEK('2023-11-01') + 1) AS week_of_month, purchase_date, 
SUM(amount_spend) AS total_amount
FROM Purchases
WHERE WEEKDAY(purchase_date) = 4
GROUP BY week_of_month, purchase_date
ORDER BY week_of_month
