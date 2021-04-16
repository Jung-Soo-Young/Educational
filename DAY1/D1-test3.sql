SELECT DISTINCT -- distinct 중복 제거 --
컬럼명 | *
FROM 테이블명
WHERE 조건식(레코드 수 관련)

GROUP BY ~~별 컬럼명(여러 컬럼명 가능) 통계낼 때 주로 사용
HAVING 그룹 바이의 조건식
ORDER BY 뽑아낸 레코드의 순서 조정
LIMIT 레코드 수 조정(제한 수)
LIMIT 10 (처음부터 10개) / 10, 20 (10번째부터 20개)

AS 필드 명을 간단하게 설정 -> WHERE 사용 불가능 (테이블명.필드명)

USE 데이터베이스명;
USE employees;

SELECT * FROM titles;

SHOW DATABASES;
SHOW TABLES STATUS;

SELECT
emp_no AS 'eno' -- emp_no 를 eno로 설정 --
FROM titles;

SELECT *
FROM titles
WHERE emp_no >= 10600 AND title = 'staff';

SELECT *
FROM titles
WHERE emp_no BETWEEN 10500 AND 20000;

SELECT *
FROM titles
WHERE title
IN ('engineer', 'staff');

SELECT * FROM employees
WHERE first_name LIKE 'g%';

SELECT * FROM employees
WHERE last_name LIKE '%m';