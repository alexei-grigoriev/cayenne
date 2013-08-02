CREATE OR REPLACE FUNCTION cayenne_tst_select_proc (varchar, numeric) 
RETURNS SETOF ARTIST
AS '
     UPDATE PAINTING SET ESTIMATED_PRICE = ESTIMATED_PRICE * 2
     WHERE ESTIMATED_PRICE < $2;
 
     SELECT DISTINCT A.artist_id, A.artist_name, A.date_of_birth
     FROM ARTIST A, PAINTING P
     WHERE A.ARTIST_ID = P.ARTIST_ID AND
     RTRIM(A.ARTIST_NAME) = $1
     ORDER BY A.ARTIST_ID;
' LANGUAGE SQL;