CREATE DATABASE IF NOT EXISTS route_tracker_system;
USE route_tracker_system;

CREATE TABLE IF NOT EXISTS drivers (
    driver_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS checkpoints (
    checkpoint_id VARCHAR(50) PRIMARY KEY,
    driver_id VARCHAR(50) NOT NULL,
    type VARCHAR(30) NOT NULL,
    location_name VARCHAR(150) NOT NULL,
    distance_from_last DECIMAL(10, 2) NOT NULL,
    expected_duration DECIMAL(10, 2) NOT NULL,
    actual_duration DECIMAL(10, 2) NOT NULL,
    penalty DECIMAL(10, 2) NOT NULL,
    is_critical BOOLEAN NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_checkpoints_driver
        FOREIGN KEY (driver_id)
        REFERENCES drivers(driver_id)
        ON DELETE CASCADE
);

CREATE INDEX idx_checkpoints_driver_id ON checkpoints(driver_id);
