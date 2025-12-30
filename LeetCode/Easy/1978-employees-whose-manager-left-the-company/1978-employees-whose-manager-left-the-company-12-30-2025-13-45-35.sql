/* Write your PL/SQL query statement below */

SELECT employee_id
  FROM Employees e
 WHERE e.salary < 30000
   AND e.manager_id is not null
   AND NOT EXISTS (SELECT employee_id
                     FROM Employees em
                    WHERE em.employee_id = e.manager_id)
 ORDER BY employee_id
;