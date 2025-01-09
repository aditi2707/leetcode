# Write your MySQL query statement below
select concat(DAYNAME(day), ", ", MONTHNAME(day), " ", DAY(day), ", ", 
YEAR(day)) as day
from Days
