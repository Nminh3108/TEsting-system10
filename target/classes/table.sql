DROP DATABASE IF EXISTS jdbc;
create database jdbc ;
use jdbc;
drop table if exists Account;
create table Account (
                         account_id			int auto_increment primary key,
                         full_name			varchar(50),
                         email				varchar(50) not null,
                         password			varchar(50) not null
);