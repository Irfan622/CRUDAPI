DROP TABLE IF EXISTS employee;
CREATE TABLE employee
(id int primary key,
name varchar(225),
age int ,
gender varchar(255),
mobile_number bigint unique key,
email varchar(255) unique key,
birthday date,
city varchar(255),
state varchar(255),
country varchar(255),
address_1 varchar(255),
address_2 varchar(255)
)