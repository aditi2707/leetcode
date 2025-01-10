# Write your MySQL query statement below
select p.product_id, sum(s.quantity) as total_quantity
from Product as p join Sales as s on p.product_id = s.product_id
group by product_id
