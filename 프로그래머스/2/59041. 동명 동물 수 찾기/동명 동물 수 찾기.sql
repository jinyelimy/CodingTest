-- 코드를 입력하세요
SELECT t.name, t.count
from (
    select name, count(name) as count
    from animal_ins
    group by name
     ) t
where t.count > 1
order by name;