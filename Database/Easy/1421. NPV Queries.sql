# Write your MySQL query statement below
select q.id, q.year, COALESCE(n.npv, 0) AS npv
from Queries as q left join NPV as n on q.id = n.id and q.year = n.year;
