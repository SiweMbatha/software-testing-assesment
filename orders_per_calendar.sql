
--1996 Orders
SELECT COUNT(*)
FROM ORDERS
where ORDER_DATE between  TO_DATE('1996-07-04', 'YYYY-MM-DD') 
and TO_DATE('1996-12-31', 'YYYY-MM-DD') 

--Results = 151

--1997 Order 
SELECT COUNT(*)
FROM ORDERS
where ORDER_DATE between  TO_DATE('1997-01-01', 'YYYY-MM-DD') 
and TO_DATE('1997-12-31', 'YYYY-MM-DD') 

--Results = 407 

--1998 Orders
SELECT COUNT(*)
FROM ORDERS
where ORDER_DATE between  TO_DATE('1998-01-01', 'YYYY-MM-DD') 
and TO_DATE('1998-05-06', 'YYYY-MM-DD')

--Results = 269
