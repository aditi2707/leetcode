-- Write your MySQL query statement below
SELECT r.contest_id, ROUND(COUNT(u.user_id) / (
    SELECT COUNT(*) 
    FROM Users
) * 100, 2) AS percentage
FROM Users AS u JOIN Register AS r
ON u.user_id = r.user_id
GROUP BY contest_id
ORDER BY percentage DESC, r.contest_id ASC
