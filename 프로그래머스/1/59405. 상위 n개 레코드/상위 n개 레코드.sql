-- 코드를 입력하세요
SELECT a.name
from (select *
     from animal_ins
     order by datetime
     ) a
where rownum =1;
