-- Write your MySQL query statement below
SELECT account_id, day, SUM(CASE
                    WHEN type = "Deposit" THEN amount
                    ELSE -amount END) 
                    OVER(PARTITION BY account_id ORDER BY day ASC) AS balance
FROM Transactions
