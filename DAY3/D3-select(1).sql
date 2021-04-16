SELECT * FROM memebertbl;

INSERT INTO memebertbl (memberID, memberName, memberAddress)
VALUES ( 'kang', '강성헌', '대구 달서구 용산동');

CREATE TABLE testTBL2 (
	id INT AUTO_INCREMENT,
	userName CHAR(3),
	age INT,
	PRIMARY KEY(id)
);

INSERT INTO testTBL2
(userName, age)
VALUES
('지민', 25),
('유나', 22),
('유경', 21);

SELECT * FROM testTBL2;

INSERT INTO testTBL2
(userName, age)
SELECT userName, age
FROM testTBL2;

SELECT *, '안녕' AS hi FROM testTBL2;

SELECT * FROM testTBL2;

-- UPDATE 테이블명 --
-- SET 컬럼명 = 수정값, 컬럼명 = 수정값 --
-- WHERE 조건식(레코드 지정) --

UPDATE testTBL2testtbl2
set userName = '수영', age = 29
WHERE id = 3;

SELECT * FROM testTBL2;

-- DELETE FROM 테이블명 --
-- WHERE 조건식 --

DELETE FROM testTBL2
WHERE id = 5;