DROP DATABASE IF EXISTS DVDCatalogue;
CREATE DATABASE DVDCatalogue;

USE DVDCatalogue;

CREATE TABLE DVDs (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    releaseYear INT NOT NULL,
    directorName VARCHAR(50) NOT NULL,
    rating VARCHAR(50) NOT NULL,
    notes VARCHAR(100) NOT NULL
);

INSERT INTO DVDs (title, releaseYear, directorName, rating, notes) VALUES
	('A Great Tale', 2015, 'Sam Jones', 'PG', 'This really is a great tale'),
    ('A Good Tale', 2012, 'Joe Smith', 'PG-13', 'This really is a good tale');