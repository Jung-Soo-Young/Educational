SELECT
	case 10
		when 1 then '일'
		when 5 then '오'
		when 10 then '십'
		ELSE '뭐지'
	END; -- case -> end 로 끝내주기 --
	
SELECT productName, cost,
	case company
		when '대우' then '탱크대우'
		when 'LG' then '사랑해요 LG'
		when '삼성' then '또 하나의 가족'
		ELSE '바보'
	END
FROM producttbl;

SELECT salary,
	case 
		when salary >= 80000 then '최고급인력'
		when salary >= 70000 then '고급인력'
	ELSE '저급인력'
	END AS title
FROM salaries