-- This file is only provided to run on the MySQL Workbench or MySQL Shell to create tables and insert values.
-- Place this file on some other directory before starting the server.

CREATE TABLE Student_Info(
	RegNo BIGINT NOT NULL,
	Name VARCHAR(30) NOT NULL,
	Dept VARCHAR(20) NOT NULL,
	Year VARCHAR(5) NOT NULL,
	Section VARCHAR(1) NOT NULL,
	Batch INT NOT NULL,
	PRIMARY KEY(RegNo)
);

describe Student_Info;

INSERT INTO Student_Info VALUES(4110,'Pranav.G','CSE','III','B',2018);
INSERT INTO Student_Info VALUES(4080,'Santhosh.K','CSE','III','B',2018);
INSERT INTO Student_Info VALUES(4082,'Santhosh Kumar.G','CSE','III','B',2018);
INSERT INTO Student_Info VALUES(4083,'Saran.M','CSE','III','B',2018);

SELECT * FROM Student_Info;


CREATE TABLE Book_Info(
    ISBN BIGINT NOT NULL,
    Title VARCHAR(50) NOT NULL,
    Author VARCHAR(30) NOT NULL,
    Country VARCHAR(20) NOT NULL,
    Cover VARCHAR(20) NOT NULL,
    Price INT NOT NULL,
    PRIMARY KEY(ISBN)
);

INSERT INTO Book_Info VALUES(111,'War and Peace','Leo Tolstoy','Russia','Hard-Cover',2276);
INSERT INTO Book_Info VALUES(112,'Peace and Live','Leo Tolstoy','Russia','Hard-Cover',2276);
INSERT INTO Book_Info VALUES(113,'Friendship','Leo Tolstoy','Russia','Hard-Cover',2276);

SELECT * FROM Book_Info;