# Write your MySQL query statement below
with ct1 as(
select * from Activity where activity_type = 'start'
),
ct2 as(
select * from Activity where activity_type = 'end'
),
ct3 as(
Select c1.machine_id , c2.timestamp - c1.timestamp as processing_time from ct1 c1 join ct2 c2  on (c1.machine_id, c1.process_id) = (c2.machine_id, c2.process_id) 
)
select distinct machine_id, round(avg(processing_time),3) as processing_time from ct3 group by machine_id;