-- Write your MySQL query statement below
SELECT (MAX(score) - MIN(score)) AS difference_in_score
FROM (
    SELECT (assignment1 + assignment2 + assignment3) AS score
    FROM Scores
    GROUP BY student_id
) AS total_score_table
