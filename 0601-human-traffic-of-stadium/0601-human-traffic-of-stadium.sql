# Write your MySQL query statement below
SELECT id, visit_date, people 
FROM
    (SELECT *, COUNT(*) OVER (PARTITION BY consecutive) AS count
    FROM
        (SELECT *, id - ROW_NUMBER() OVER (ORDER BY id) AS consecutive
        FROM Stadium
        WHERE people >= 100) t )t2
WHERE count >= 3
ORDER BY id