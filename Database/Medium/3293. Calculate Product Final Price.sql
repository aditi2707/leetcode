# Write your MySQL query statement below
SELECT a.product_id, (CASE
        WHEN a.discount IS NULL THEN a.price
        ELSE (1 - (discount / 100)) * a.price
        END) AS final_price, a.category
FROM (
    SELECT p.product_id, p.category, p.price, d.discount
    FROM Products AS p LEFT JOIN Discounts AS d
    ON p.category = d.category
) AS a
