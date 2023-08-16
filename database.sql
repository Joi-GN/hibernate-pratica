--MySQL
CREATE DATABASE `hibernate-pratica`;
USE `hibernate-pratica`;
CREATE TABLE `message` (
	`id` bigint(20) NOT null AUTO_INCREMENT,
    `text` character varying(255) null DEFAULT null,
    PRIMARY KEY(`id`)
);

-- PostgreSQL
CREATE DATABASE "hibernate-pratica";
\c hibernate-pratica
CREATE TABLE message (
    'id' serial not null,
    'text' varchar(255) null,
    primary key('id')
);