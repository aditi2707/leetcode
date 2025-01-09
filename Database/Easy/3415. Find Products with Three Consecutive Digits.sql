# Write your MySQL query statement below
select product_id, name
from Products
where name regexp '[0-9]{3}' and name not regexp '[0-9]{4,}'
order by product_id asc
