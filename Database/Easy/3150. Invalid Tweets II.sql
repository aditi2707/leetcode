# Write your MySQL query statement below
select tweet_id
from Tweets
where LENGTH(content) > 140 or 
    (content like '%#%#%#%#%') or 
    (content like '%@%@%@%@%')
order by tweet_id asc
