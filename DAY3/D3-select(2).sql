CREATE TABLE testTBL3
AS
SELECT * FROM testtbl2;

CREATE TABLE testTBL4 (SELECT * FROM testtbl2);

DROP TABLE testtbl2;
DELETE FROM testTBL3;
TRUNCATE testTBL4;

SELECT * FROM testtbl2;

SELECT NOW();

SELECT CAST ('2020-10-19 12:35:29' AS DATE) AS d_date;
SELECT CAST ('2020-10-19 12:35:29' AS DATETIME);

SELECT CAST ('10' AS INT), '10' + '10';
CONCAT('10', '10');

SELECT DATE_FORMAT(NOW(), '%y년%m월%d일%h:%i:%s'); 

SELECT emp_no, gender, if(gender = 'M', '남성', '여성')
FROM employees;

SELECT *, IFNULL(salary, '널이다') FROM salaries -- ifnull은 자주 쓰인다. 알아두기 --
WHERE salary IS NULL
OR emp_no = 17170;