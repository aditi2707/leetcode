-- Write your MySQL query statement below

SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS sub



-- SELECT MAX(num) AS num
-- FROM MyNumbers
-- WHERE num IN(
--     SELECT num
--     FROM MyNumbers
--     GROUP BY num
--     HAVING COUNT(num) = 1
-- )
