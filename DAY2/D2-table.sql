CREATE TABLE productTBL (
	productName CHAR(4) PRIMARY KEY,
	cost INT NOT NULL,
	makeData DATE,
	company CHAR(5),
	amount INT NOT null
);

CREATE TABLE memeberTBL (
	memberID CHAR(8) PRIMARY KEY,
	memberName CHAR(5) NOT NULL,
	memberAddress CHAR(20)
);

-- varchar(8) vs char(8)
-- 정확성vs 속도