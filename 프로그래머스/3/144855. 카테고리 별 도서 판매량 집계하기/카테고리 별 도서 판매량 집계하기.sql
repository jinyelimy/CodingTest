-- 코드를 입력하세요
SELECT category, sum(total_sales) as total_sales
from (select book_id, sum(sales) as total_sales
     from book_sales
     where to_char(sales_date,'YYYY-MM') = '2022-01'
     group by book_id) t
join book b on t.book_id = b.book_id
group by category
order by category;
