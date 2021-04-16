SELECT *
, CONCAT(first_name, ', ', last_name, ', ', gender) AS NAME
, CONCAT_WS(', ', first_name, last_name, gender) AS NAME2
from employees;

SELECT FORMAT(123456.123456789, 4); -- 천단위 콤마, 소수자리 수 --

SELECT *, INSERT(dept_no, 2, 0, 'i')
FROM dept_emp;

SELECT *
, LEFT(first_name, 2)
, RIGHT(first_name, 3)
FROM employees;

SELECT first_name
, LPAD(first_name, 10, '#')
, RPAD(first_name, 10, '#')
FROM employees;

SELECT TRIM('        안녕        ') AS hi
, TRIM('       하하       하       ')
, REPLACE('       하하       하       ', ' ', '');

SELECT birth_date,
LEFT(birth_date, 4) AS year,
SUBSTRING(birth_date, 6, 2) AS mon,
RIGHT(birth_date, 2) AS DAY,
cast(RIGHT(birth_date, 2) AS INT) AS day_int
FROM employees;

SELECT
CEIL(10.3),
CEIL(10.1)  -- ceil 올림처리 --
ROUND(10.4), -- round 반올림처리 --
ROUND(10.6),
FLOOR(10.9)  -- floor 내림처리 --
FLOOR(10.4);