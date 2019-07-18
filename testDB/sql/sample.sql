drop database if exists sample5;
create database sample5;
use sample5;

create table sample_table
No int,
name varchar(255),
age int,
Mail varchar(255)
);

insert into sample_table values(1,"Yamada","21","xxx@yahoo.com");
insert into sample_table values(2,"sato","39","yyy@google.com");
insert into sample_table values(3,"harada","44","zzz@yahoo.com");
