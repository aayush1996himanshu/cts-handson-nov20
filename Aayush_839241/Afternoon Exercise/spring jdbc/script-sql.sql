create database cts_db;
use cts_db;
create table employee(
id integer primary key,
name varchar(15),
salary double
);

insert into employee
values
(1, "Aayush", 45000),
(2, "Aakash", 40000),
(3, "Arpit", 35000);