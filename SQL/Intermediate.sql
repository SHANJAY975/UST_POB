use ust_db;
Select * from employee;
select * from dept;


 -- Joins
 
 -- Inner join
select e.id, e.name, e.salary, e.location, e.dept_id, d.name from employee e Join dept d on e.dept_id = d.id;

select * from employee e Join dept d on e.dept_id = d.id where d.name = 'IT';

-- outer join
 -- Types (LEFT JOIN, RIGHT )
 
 update employee set dept_id = 101 where id=3;
 update employee set dept_id = 103 where id=4;
select * from employee;


-- LEFT JOIN

select e.*, d.* from  employee e  LEFT Join dept d on e.dept_id = d.id;

-- Right JOIN

select e.*, d.* from  employee e  Right Join dept d  on e.dept_id = d.id;


-- find dept with no employee

select d.* from dept d LEFT Join employee e on e.dept_id = d.id where e.dept_id IS null;

-- find the min, ,max and avg salaries
SELECT max(salary) as 'MAXIMUM salary', min(salary) as 'MINIMUM salary', avg(salary) as 'Average salary' from employee;

-- find highest paid employee
select * from employee order by salary DESC Limit 1;

-- find the highest paid employee in each department
SELECT dept_id, max(salary) as 'MAXIMUM salary', min(salary) as 'MINIMUM salary', avg(salary) as 'Average salary' from employee group by dept_id;

-- total employee in each Dept
SELECT dept_id , COUNT(dept_id) from employee group by dept_id;

select d.name, COUNT(e.id) from employee e Right Join dept d on e.dept_id = d.id group by d.id;


