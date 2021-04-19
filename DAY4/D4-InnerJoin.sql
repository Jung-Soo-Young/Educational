SELECT 
B.nm, C.cls, A.score FROM t_score A
INNER JOIN t_student B
ON A.s_id = B.s_id
INNER JOIN t_class C
ON A.c_id = C.c_id;

SELECT B.nm, B.s_id, A.s_id, A.score, A.c_id
FROM t_score A
INNER JOIN t_student B
ON A.s_id = B.s_id
INNER JOIN t_class C
ON A.c_id = C.c_id;