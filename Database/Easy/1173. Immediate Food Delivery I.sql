# Write your MySQL query statement below
select round((((
    select count(order_date)
    from Delivery
    where order_date = customer_pref_delivery_date
) / count(order_date)) * 100), 2) as immediate_percentage
from Delivery
