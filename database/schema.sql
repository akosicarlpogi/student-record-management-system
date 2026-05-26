-- Run this in pgAdmin Query Tool or psql.

CREATE DATABASE studentdb;

-- Connect to studentdb first before running the table creation below.

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    course VARCHAR(50) NOT NULL,
    year_level VARCHAR(20) NOT NULL
);

-- Optional sample records for testing:
INSERT INTO students (name, course, year_level)
VALUES
    ('Juan Dela Cruz', 'BSIT', '1st Year'),
    ('Maria Santos', 'BSCS', '2nd Year');
