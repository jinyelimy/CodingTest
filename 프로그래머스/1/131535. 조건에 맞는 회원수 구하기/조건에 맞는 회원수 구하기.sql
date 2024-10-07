-- 코드를 입력하세요
SELECT count(*) as users
from (select *
     from user_info
     where to_char(joined,'YYYY') = '2021'
     ) t
where t.age between 20 and 29;