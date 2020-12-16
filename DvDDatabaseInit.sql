drop database if exists DVDCatalogue;

create database DVDCatalogue;

use DVDCatalogue;

create table DvD(
	DvDId int primary key auto_increment,
    Title varchar(128) not null,
    ReleaseYear int not null,
    Director varchar(60) not null,
    Rating char(5) not null,
    notes varchar(128)
);

INSERT INTO DvD (DvDId, Title, ReleaseYear, Director, Rating, notes) VALUES
	(1, "A Great Tale", 2015, "Sam Jones", "PG", "This really great tale!"),
    (2, "A Good Tale", 2012, "Joe Smith", "PG-13", "This is a good tale!");