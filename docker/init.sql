CREATE TABLE regret (
                        id SERIAL PRIMARY KEY,
                        title TEXT NOT NULL,
                        severity TEXT NOT NULL,
                        responsible_party TEXT,
                        timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO regret (title, severity, responsible_party)
VALUES
    ('Trusted a Stack Overflow snippet', 'severe', 'student-7'),
    ('Ran terraform apply without reading it', 'moderate', 'student-3');