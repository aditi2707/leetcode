-- Write your MySQL query statement below
SELECT SUM(
    CASE WHEN (WEEKDAY(submit_date) = 5 OR WEEKDAY(submit_date) = 6) THEN 1
        ELSE 0
        END
    ) AS weekend_cnt, SUM(
        CASE WHEN (WEEKDAY(submit_date) < 5) THEN 1
        ELSE 0
        END
    ) AS working_cnt
FROM Tasks
