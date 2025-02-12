-- Write your MySQL query statement below
SELECT order_id, customer_id, order_type
FROM Orders
WHERE (customer_id NOT IN (
    SELECT DISTINCT customer_id
    FROM Orders
    WHERE order_type = 0
))
OR order_type = 0
