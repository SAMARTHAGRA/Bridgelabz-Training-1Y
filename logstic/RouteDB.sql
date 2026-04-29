CREATE DATABASE IF NOT EXISTS RouteDB;
USE RouteDB; 

CREATE TABLE Driver (
    driverId  VARCHAR(20) PRIMARY KEY,
    name      VARCHAR(100) NOT NULL
);

CREATE TABLE Checkpoint (
    checkpointId      VARCHAR(20) PRIMARY KEY,
    driverId          VARCHAR(20),
    locationName      VARCHAR(100),
    distanceFromLast  DOUBLE,
    expectedDuration  DOUBLE,
    actualDuration    DOUBLE,
    checkpointType    VARCHAR(30),
    routeOrder        INT,
    FOREIGN KEY (driverId) REFERENCES Driver(driverId)
);
INSERT INTO Driver VALUES ('D001', 'Kavita Nair ');
INSERT INTO Driver VALUES ('D002', 'Anshu');

INSERT INTO Checkpoint VALUES ('C001', 'D001', 'Delhi Hub',     0.0,  30.0, 28.0, 'DeliveryCheckpoint', 1);
INSERT INTO Checkpoint VALUES ('C002', 'D001', 'Agra Stop',   120.0,  20.0, 55.0, 'RestCheckpoint',     2);
INSERT INTO Checkpoint VALUES ('C003', 'D001', 'Mathura Fuel', 60.0,  15.0, 15.0, 'FuelCheckpoint',     3);