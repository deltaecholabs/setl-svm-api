CREATE TABLE system
(
    system_id SERIAL PRIMARY KEY,
    key  TEXT NOT NULL,
    name  TEXT NOT NULL
);
ALTER SEQUENCE system_system_id_seq RESTART 10000;