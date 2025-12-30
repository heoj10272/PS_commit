/* Write your PL/SQL query statement below */

SELECT  * 
  FROM  Cinema c
 WHERE  mod(c.id, 2) = 1
   AND  description != 'boring'
 ORDER  BY rating desc
   ;