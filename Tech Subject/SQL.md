<h1 align="center" > Structured Query Language </h1>
<p align="center" > (SQL) </p>

# Structured Query Language

#### CRUD

+ Create
+ Read
+ Update
+ Delete

### Unique & Distinct 



### SQL Basic

+ DDL (Data Definition Language): `CREATE`, `ALTER`, `DROP`, `TRUNCATE`
+ DML (Data Manipulation Language): `SELECT`, `INSERT`, `UPDATE`, `DELETE`
+ DCL (Data Control Language): `GRANT`, `REVOKE`
+ TCL (Transaction Control Language): `COMMIT`, `ROLLBACK`, `SAVEPOINT`


#### Basis Query

```sql
-- Select all columns
SELECT * FROM employees;

-- Select specific columns
SELECT name, salary FROM employees;

-- WHERE clause
SELECT * FROM employees WHERE salary > 50000;

-- DISTINCT
SELECT DISTINCT department FROM employees;


```

#### Filtering and Sorting

```sql
-- AND / OR / NOT
SELECT * FROM employees WHERE salary > 30000 AND department = 'HR';

-- LIKE, IN, BETWEEN
SELECT * FROM employees WHERE name LIKE 'A%';
SELECT * FROM employees WHERE department IN ('IT', 'HR');
SELECT * FROM employees WHERE joining_date BETWEEN '2023-01-01' AND '2023-12-31';

-- ORDER BY
SELECT * FROM employees ORDER BY salary DESC;


```


#### Aggregate Functions + GROUP BY + HAVING

```sql

-- COUNT, SUM, AVG, MAX, MIN
SELECT COUNT(*) FROM employees;
SELECT AVG(salary) FROM employees;

-- GROUP BY
SELECT department, COUNT(*) FROM employees GROUP BY department;

-- HAVING
SELECT department, AVG(salary) 
FROM employees 
GROUP BY department 
HAVING AVG(salary) > 50000;


```

#### Joins

```sql 

-- INNER JOIN
SELECT e.name, d.dept_name 
FROM employees e 
INNER JOIN departments d ON e.dept_id = d.id;

-- LEFT JOIN
SELECT e.name, d.dept_name 
FROM employees e 
LEFT JOIN departments d ON e.dept_id = d.id;

-- RIGHT JOIN
SELECT e.name, d.dept_name 
FROM employees e 
RIGHT JOIN departments d ON e.dept_id = d.id;

-- FULL JOIN (if supported)
SELECT e.name, d.dept_name 
FROM employees e 
FULL OUTER JOIN departments d ON e.dept_id = d.id;


```

#### Sub-query

```sql

-- Subquery in WHERE
SELECT name FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);

-- IN subquery
SELECT name FROM employees 
WHERE dept_id IN (SELECT id FROM departments WHERE location = 'Delhi');


```


#### Common Interview Queries

```sql

-- Find 2nd highest salary
SELECT MAX(salary) FROM employees 
WHERE salary < (SELECT MAX(salary) FROM employees);

-- Find duplicate entries
SELECT name, COUNT(*) 
FROM employees 
GROUP BY name 
HAVING COUNT(*) > 1;

-- Get employees with highest salary in each department
SELECT * FROM (
  SELECT *, 
         RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS rnk 
  FROM employees
) AS ranked 
WHERE rnk = 1;


```






***

<h3 align="center">Connect with me:</h3>
<p align="center">
<a href="https://twitter.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://linkedin.com/in/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://fb.com/singhsaurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="singhsaurabhbahadur" height="30" width="40" /></a>
<a href="https://instagram.com/saurabhbahadur_" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="saurabhbahadur_" height="30" width="40" /></a>
<a href="https://www.youtube.com/c/mighty saur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="mighty saur" height="30" width="40" /></a>
<a href="https://www.hackerrank.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/hackerrank.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://discord.gg/aQR27Bg7de" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="aQR27Bg7de" height="30" width="40" /></a>
</p>




---
