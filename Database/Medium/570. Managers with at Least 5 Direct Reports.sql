-- Write your MySQL query statement below

SELECT e.name
FROM Employee AS e
JOIN
(SELECT managerId
FROM Employee
GROUP BY managerId
HAVING COUNT(managerId) >= 5) AS sub
ON e.id = sub.managerId



-- SELECT e.name
-- FROM Employee AS e
-- JOIN
-- (SELECT managerId, COUNT(managerId) AS reportees
-- FROM Employee
-- GROUP BY managerId) AS sub
-- ON e.id = sub.managerId
-- WHERE sub.reportees >= 5
