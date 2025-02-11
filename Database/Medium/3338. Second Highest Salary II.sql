-- Write your MySQL query statement below

WITH salary_rank AS (
    SELECT emp_id, dept, DENSE_RANK() OVER (PARTITION BY dept ORDER BY salary DESC) AS rk
    FROM employees
)

SELECT emp_id, dept
FROM salary_rank
WHERE rk = 2
ORDER BY 1 ASC
