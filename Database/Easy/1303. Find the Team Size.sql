# Write your MySQL query statement below
select e1.employee_id, count(e1.employee_id) as team_size
from Employee as e1 join Employee as e2
on e1.team_id = e2.team_id
group by e1.employee_id
