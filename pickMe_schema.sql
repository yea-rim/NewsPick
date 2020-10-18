USE newspick;


CREATE TABLE press(
	pressID INT(10) NOT NULL,
    pressName VARCHAR(10) NOT NULL,
    pressSubscription INT(1) NOT NULL,
    PRIMARY KEY(pressID)
);

CREATE TABLE reporter(
	reporterID INT(10) NOT NULL,
	reporterName VARCHAR(10) NOT NULL,
	reporterSubscription INT(1) NOT NULL,
	pressName VARCHAR(10) NOT NULL,
	FOREIGN KEY(pressName) REFERENCES press(pressName),
	PRIMARY KEY(reporterID)
);

CREATE TABLE USER(
	ID VARCHAR(20) NOT NULL,
	PASSWORD VARCHAR(20) NOT NULL,
	pressSubscription INT(1) NOT NULL,
	eporterSubscription INT(1) NOT NULL,
	FOREIGN KEY(pressSubscription) REFERENCES press(pressSubscription),
	FOREIGN KEY(reporterSubscription) REFERENCES reporter(reporterSubscription),
	PRIMARY KEY(ID)
);
