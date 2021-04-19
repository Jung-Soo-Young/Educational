CREATE TABLE t_student (
	s_id INT UNSIGNED PRIMARY KEY, -- 음수의 값 -> 양수로 증가 --
	nm VARCHAR(3) NOT NULL,
	ph CHAR(13)
);

INSERT INTO t_student (s_id, nm)
VALUES (1112, '갑');

INSERT INTO t_student (s_id, nm, ph)
VALUES 
(1111, '을', '010-1234-5678'),
(1113, '병', '010-2345-6789');

SELECT * FROM t_student;

CREATE TABLE t_class (
	c_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, -- Auto_increment 자동으로 c_id 값 증가 --
	cls VARCHAR(5) NOT NULL,
	teacher VARCHAR(5) NOT null
);

INSERT INTO t_class (cls, teacher)
VALUES
('수학', '김하나'),
('과학', '판테온'),
('국어', '오징어');

SELECT * FROM t_class;

CREATE TABLE t_score (
	s_id INT unsigned,
	c_id INT unsigned,
	score INT,
	PRIMARY KEY(s_id, c_id),
	FOREIGN KEY(s_id) REFERENCES t_student(s_id), -- 외래키 : 타입이 완벽히 같아야 함 --
	FOREIGN KEY(c_id) REFERENCES t_class(c_id)
);

INSERT INTO t_score (s_id, c_id, score)
VALUES
(1111, 2, 90);

DROP TABLE t_score;

SELECT * FROM t_score;