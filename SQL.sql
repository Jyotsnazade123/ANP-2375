CREATE TABLE customer(
Cust_id Varchar (5) ,
Fname varchar (15) ,
Lname varchar(15),
Area Char(2)  ,
Phone INT,
DOB Date ,
Payment decimal(6,2) 
); 
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A01', 'Alia', 'Razi', 'ZA', 6125467, '1985-02-16', 200.50);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A02', 'Vandu', 'Gay', 'PU', 5560379, '1986-12-20', 300.75);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A03', 'Prem', 'Jhade', 'DA', 4560389, '1967-07-25', 500.00);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A04','Basu', 'Navindi', 'BA', 6125401, '1956-02-26', 860.00);
INSERT INTO customer(Cust_id, Fname, Lname, Area,  DOB, Payment)
VALUES('A05', 'Dipti', 'Jadhav', 'NA', '1989-02-15', 500.50);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A06', 'Raghu', 'Swami', 'PH', 3425274, '1988-07-23', 1500.50);
DESC customer;
select * from customer;
ALTER TABLE customer
ADD systemDate date;

select * from customer;
UPDATE customer
SET phone = 1234567
WHERE Cust_id = 'A02';

UPDATE customer
SET phone = 3794576
WHERE Cust_id = 'A04';

UPDATE customer
SET DOB = '1967-08-26'
WHERE Cust_id = 'A03';

UPDATE customer
SET DOB = '1990-03-16'
WHERE Cust_id = 'A05';
select * from customer;
DELETE FROM customer
WHERE Cust_id = 'A01';
DELETE FROM customer
WHERE Cust_id = 'A05';
TRUNCATE TABLE customer;
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A01', 'Ivan', 'Ross', 'SA', 6125467, '1986-01-15', 800.50);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A02', 'Vandana', 'Ray', 'MU', 5560379, '1987-12-20', 1000.75);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A03', 'Ramesh', 'Zade', 'DA', 4560389, '1967-07-25', 500.00);
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A04','Basu', 'Navindi', 'BA', 6125401, '1956-02-26', 860.00);
INSERT INTO customer(Cust_id, Fname, Lname, Area,  DOB, Payment)
VALUES('A05', 'Jyoshi', 'Shastrakr', 'NA', '1989-02-15', 500.50);
UPDATE customer
SET Fname = 'jyotsna'
WHERE Cust_id = 'A02';
DELETE FROM customer
WHERE Cust_id = 'A03';



