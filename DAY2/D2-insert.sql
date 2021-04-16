-- insert, select, update, delete --

SELECT * FROM memebertbl;

INSERT INTO memebertbl
( memberID, memberName, memberAddress )

VALUES
( 'Dang', '당탕이', '경기 부천시 중동' ),
( 'Jee', '지운이', '서울 은평구 증산동' ),
( 'Han', '한주연', '인천 남구 주안동' ),
( 'Sang', '상길이', '경기 성남구 분당구' );

SELECT * FROM producttbl;

INSERT INTO producttbl
(productname, cost, makeData, company, amount)
VALUES
('컴퓨터', 10, '2017-01-01', '삼성', 17),
('세탁기', 20, '2018-09-01', 'LG', 3),
('냉장고', 5, '2019-02-01', '대우', 22);