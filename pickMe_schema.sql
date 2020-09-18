CREATE database pickMe;
USE pickMe;

--언론사 table
CREATE TABLE press(
	pressID int(10) not null,
    pressName varchar(10) not null,
    pressSubscription int(1) not null,
    PRIMARY KEY(pressID)
);

--기자 talbe
CREATE TABLE reporter(
	reporterID int(10) not null,
	reporterName varchar(10) not null,
	reporterSubscription int(1) not null,
	pressName varchar(10) not null,
	FOREIGN KEY(pressName) REFERENCES press(pressName)
	PRIMARY KEY(reporterID)
);

--user talbe

CREATE TABLE user(
	ID varchar(20) not null,
	password varchar(20) not null,
	pressSubscription int(1) not null,
	eporterSubscription int(1) not null,
	FOREIGN KEY(pressSubscription) REFERENCES press(pressSubscription)
	FOREIGN KEY(reporterSubscription) REFERENCES reporter(reporterSubscription)
	PRIMARY KEY(ID)
);


insert into user (ID,password) values ('ys','ys');