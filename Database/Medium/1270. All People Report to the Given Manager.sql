-- Write your MySQL query statement below
WITH Managers (employee_id) AS (
    SELECT employee_id
    FROM Employees
    WHERE manager_id = 1 AND employee_id != 1
)

SELECT employee_id
FROM Employees
WHERE (manager_id = 1 AND employee_id != 1)
OR
manager_id IN 
    (SELECT employee_id
    FROM Managers
    )
OR
manager_id IN 
    (SELECT employee_id
    FROM Employees
    WHERE manager_id IN 
        (   
        SELECT employee_id
        FROM Managers
        )
    )
OR
manager_id IN 
    (SELECT employee_id
    FROM Employees
    WHERE manager_id IN 
        (   
        SELECT employee_id
        FROM Employees
        WHERE manager_id IN
            (
            SELECT employee_id
            FROM Managers
            )
        )
    )
