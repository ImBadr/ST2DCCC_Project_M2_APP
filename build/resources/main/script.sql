/***************************************************************************
DATABASE CINEMA
Authors : TADJER Badr & BOIRARD Cédric
****************************************************************************/

/*
Requests :
SELECT * FROM  MOVIES;
SELECT * FROM  ACTORS;
*/

CREATE TABLE IF NOT EXISTS MOVIES (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    releaseDate INT,
    author VARCHAR(100)
);


CREATE TABLE IF NOT EXISTS ACTORS (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    birthYear INT,
    idMovie INT
);
