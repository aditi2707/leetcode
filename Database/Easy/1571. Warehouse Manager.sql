# Write your MySQL query statement below
select w.name as warehouse_name, sum(w.units * vol) as volume
from warehouse as w left join (
    select p.product_id, (p.Width * p.Length * p.Height) as vol
    from Products as p
) as prod on w.product_id = prod.product_id
group by w.name
