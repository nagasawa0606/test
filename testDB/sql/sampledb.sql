drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
No int,
name varchar(255),
age int,
Mail varchar(255)
);

insert into sample_table values(1,"yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"sato",39,"yyy@google.com");
insert into sample_table values(3,"hamada",44,"zzz@yahoo.co.jp");