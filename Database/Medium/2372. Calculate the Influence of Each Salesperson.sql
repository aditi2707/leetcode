-- Write your MySQL query statement below
SELECT s.salesperson_id, s.name, IFNULL(j.total_price, 0) AS total
FROM Salesperson AS s LEFT JOIN 
        (SELECT c.salesperson_id, SUM(cs.cust_price) AS total_price
        FROM Customer AS c JOIN 
                (SELECT customer_id, SUM(price) AS cust_price
                FROM Sales
                GROUP BY customer_id) AS cs
        ON c.customer_id = cs.customer_id
        GROUP BY c.salesperson_id) AS j
ON s.salesperson_id = j.salesperson_id
