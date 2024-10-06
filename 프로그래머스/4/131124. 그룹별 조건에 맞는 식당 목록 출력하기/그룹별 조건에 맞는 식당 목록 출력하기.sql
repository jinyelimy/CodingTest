-- 코드를 입력하세요
SELECT m.member_name, r.review_text, to_char(r.review_date,'YYYY-MM-DD') review_date
from rest_review r
join member_profile m on r.member_id = m.member_id 
WHERE r.member_id = (
    SELECT member_id
    FROM rest_review
    GROUP BY member_id
    ORDER BY COUNT(*) DESC
    FETCH FIRST 1 ROWS ONLY 
)
order by r.review_date,r.review_text;