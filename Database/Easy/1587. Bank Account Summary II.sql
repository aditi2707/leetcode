# Write your MySQL query statement below
select u.name as NAME, t.balance as BALANCE
from Users as u join
(
    select account, sum(amount) as balance
    from Transactions
    group by account
) as t on u.account = t.account
where t.balance > 10000
