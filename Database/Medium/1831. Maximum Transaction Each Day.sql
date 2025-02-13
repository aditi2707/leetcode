-- Write your MySQL query statement below

SELECT transaction_id
FROM (
    SELECT transaction_id, RANK() OVER (PARTITION BY day ORDER BY amount DESC) AS rk
    FROM Transactions
) AS t
WHERE rk = 1
ORDER BY transaction_id ASC



-- SELECT transaction_id
-- FROM Transactions
-- WHERE transaction_id IN (
--     SELECT transaction_id
--     FROM Transactions
--     WHERE (day, amount) IN (
--         SELECT day, MAX(amount)
--         FROM Transactions
--         GROUP BY day
--     ) 
-- )
-- ORDER BY transaction_id ASC
