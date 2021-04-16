-- SELECT 컬럼명 FROM 테이블명

SELECT cost, company FROM producttbl;
FROM producttbl;

SELECT *
FROM producttbl
WHERE company = 'LG';

SELECT * FROM memebertbl;

SELECT *
FROM memebertbl
WHERE memberName = '지운이';

SELECT *
FROM producttbl
WHERE cost >= 10;

-- memberName이 '지운이'인 레코드만 나타도록 해주세요. (모든 컬럼)