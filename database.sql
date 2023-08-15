CREATE DATABASE `hibernate-pratica`;
USE `hibernate-pratica`;
CREATE TABLE `message` (
	`id` bigint(20) NOT null AUTO_INCREMENT,
    `text` varchar(255) null DEFAULT null,
    PRIMARY KEY(`id`)
);