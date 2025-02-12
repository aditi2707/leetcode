-- Write your MySQL query statement below
SELECT a.sale_date, (a.apple_count - o.orange_count) AS diff
FROM (
    (SELECT sale_date, SUM(sold_num) AS apple_count
    FROM Sales
    WHERE fruit = "apples"
    GROUP BY sale_date
    ) AS a 
    JOIN
    (SELECT sale_date, SUM(sold_num) AS orange_count
    FROM Sales
    WHERE fruit = "oranges"
    GROUP BY sale_date
    ) AS o 
    ON a.sale_date = o.sale_date
)
GROUP BY sale_date
ORDER BY sale_date
