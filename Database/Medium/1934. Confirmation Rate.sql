-- Write your MySQL query statement below
SELECT s.user_id, ROUND(IFNULL(AVG(action = "confirmed"), 0), 2) AS confirmation_rate
FROM Signups AS s LEFT JOIN Confirmations AS c
ON s.user_id = c.user_id
GROUP BY s.user_id
