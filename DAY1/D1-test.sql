CREATE TABLE t_exam (
	i_exam INT PRIMARY KEY,
	title VARCHAR(100),
	jumin CHAR(13),
	age INT(3) NOT NULL
);

DROP TABLE t_exam;

DROP DATABASE java;
CREATE DATABASE java;

INSERT INTO t_exam
(i_exam, title, jumin, age)
VALUES
(1, '안녕하세요', '9002122876544', 25);

INSERT INTO t_exam
(title, i_exam, jumin, age)
VALUES 
('홍길동', 2, '1234569876543', 27),
('이순신', 3, '9876541234567', 29);

-- 주석 --
SELECT * FROM t_exam;