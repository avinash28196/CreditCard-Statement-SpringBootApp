CREATE TABLE CREDITCARD
(
  ID INT PRIMARY KEY,
  Name VARCHAR(55),
  LIMIT_BAL INT(55),
  SEX INT(55),
  EDUCATION INT(55),
  MARRIAGE INT(55),
  AGE INT(55),
  PAY_1 INT(55),
  PAY_2 INT(55),
  PAY_3 INT(55),
  PAY_4 INT(55),
  PAY_5 INT(55),
  PAY_6 INT(55),
  BILL_AMT1 INT(55),
  BILL_AMT2 INT(55),
  BILL_AMT3 INT(55),
  BILL_AMT4 INT(55),
  BILL_AMT5 INT(55),
  BILL_AMT6 INT(55),
  PAY_AMT1 INT(55),
  PAY_AMT2 INT(55),
  PAY_AMT3 INT(55),
  PAY_AMT4 INT(55),
  PAY_AMT5 INT(55),
  PAY_AMT6 INT(55),
  DEFAULT_PAYMENT_NEXTMONTH INT(55),
) 
AS 
SELECT * 
FROM CSVREAD('/Users/nextbitgeek/Developer/CreditCard-Statement-SpringBootApp/CreditCard Statement /src/main/resources\creditcard.csv');
			