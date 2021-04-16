CREATE TABLE indexTBL (
	first_name VARCHAR(14),
	last_name javaVARCHAR(16),
	hire_date date
);

INSERT INTO indextbl
(first_name, last_name, hire_date)
SELECT first_name, last_name, hire_date
FROM employees.employees
LIMIT 1000;

explain SELECT * FROM indextbl
WHERE first_name = 'Mary';
-- type이 all인 경우 전체를 조사 --

CREATE INDEX idx_indexTBL_firstname
ON indextbl(first_name);