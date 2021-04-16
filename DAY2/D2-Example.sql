-- 스칼라 값

SELECT * FROM employees
WHERE gender = (SELECT gender FROM employees WHERE emp_no = 10066);

SELECT * FROM salaries
ORDER BY salary;

SELECT * FROM salaries
ORDER BY emp_no, salary DESC;

SELECT * FROM dept_emp
ORDER BY emp_no ASC, dept_no DESC;

SELECT distinct dept_no FROM dept_emp; -- distinct 중복제거 --

SELECT DISTINCT emp_no, dept_no FROM dept_emp;

UPDATE salaries
SET salary = NULL
WHERE emp_no = 17169
AND from_date = '1990-11-07';

SELECT * FROM salaries
ORDER BY salary desc
LIMIT 5;

SELECT * FROM dept_emp
ORDER BY emp_no;

SELECT COUNT(*) FROM salaries;

SELECT MAX(salary) FROM salaries;

SELECT emp_no, MAX(salary), MIN(salary), SUM(salary), COUNT(salary)
FROM salaries
group BY emp_no
ORDER BY AVG(salary) DESC;

SELECT emp_no, MAX(salary), MIN(salary), SUM(salary), COUNT(salary)
FROM salaries
group BY emp_no
HAVING COUNT(salary) = 10
ORDER BY count(salary) DESC, avg(salary) DESC;

SELECT emp_no, AVG(salary) from salaries  
GROUP BY emp_no
having AVG(salary) >= 90000
ORDER BY AVG(salary) ASC;

SELECT title FROM titles
GROUP BY title
ORDER BY count(emp_no) desc
LIMIT 1;

SELECT title FROM titles
GROUP BY title
HAVING COUNT(title) = ( -- 최대값의 개수를 가진 타이틀 명 --
	SELECT MAX(a.cnt) FROM ( -- 최대값을 구한다 --
		SELECT COUNT(title) AS cnt FROM titles GROUP BY title) A -- 각 타이틀 별로 레코드 수의 개수 --
); 

SELECT * FROM employees
where gender = 'f' AND first_name like 's%' and hire_date >= '1990-01-01';