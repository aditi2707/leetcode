# Write your MySQL query statement below
select h.team_name as home_team, a.team_name as away_team
from Teams as h cross join Teams as a
where h.team_name != a.team_name;
