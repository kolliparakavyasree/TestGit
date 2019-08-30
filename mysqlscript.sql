create database if not exists demo;

use demo;

create table if not exists emp(empno int, ename varchar(20), sal int);

insert into emp values (1001,"KGF",30000);
insert into emp values (1002,"KG",30000);
insert into emp values (1003,"GK",30000);