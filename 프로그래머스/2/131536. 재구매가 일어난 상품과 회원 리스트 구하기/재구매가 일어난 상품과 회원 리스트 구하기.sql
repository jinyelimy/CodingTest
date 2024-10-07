-- 코드를 입력하세요
SELECT user_id, product_id
FROM (
    SELECT user_id, product_id, COUNT(*) AS total 
    FROM online_sale 
    GROUP BY user_id, product_id
) online_sale
WHERE total > 1
order by user_id asc,product_id desc;