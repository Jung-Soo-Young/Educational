SELECT * FROM titles
WHERE title != 'staff';

SELECT * FROM salaries
WHERE salary >= 70000 AND salary < 80000;

SELECT * FROM salaries
WHERE salary BETWEEN 70000 AND 80000; -- and = between --

SELECT * FROM employees
WHERE first_name LIKE '%en%'; -- Like % --

SELECT * FROM titles;
WHERE title = 'staff' OR tiitle = 'engineer'; -- OR문 --

SELECT * FROM titles
WHERE title IN ('staff', 'engineer');

SELECT * FROM employees
WHERE gender = 'M';

SELECT gender FROM employees
WHERE emp_no = 10110;

SELECT * FROM titles
WHERE title IN (
	SELECT title FROM titles
	WHERE emp_no = 10007
);

SELECT * FROM salaries
ORDER BY emp_no DESC, salary; -- ASC : 오름차순. DESC : 내림차순 --

SELECT distinct title FROM titles;

SELECT * FROM dept_emp
ORDER BY emp_no desc
LIMIT 1, 10; -- 1번부터 10개 --