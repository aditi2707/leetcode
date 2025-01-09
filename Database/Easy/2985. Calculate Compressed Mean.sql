# Write your MySQL query statement below
select round(sum(order_occurrences * item_count) / sum(order_occurrences),2) as average_items_per_order
from Orders;
