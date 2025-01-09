# Write your MySQL query statement below

select s.id, s.name
from Students as s left join Departments as d on s.department_id = d.id
where d.id is NULL;



-- select id, name
-- from Students
-- where department_id not in 
-- (select id
-- from Departments);
