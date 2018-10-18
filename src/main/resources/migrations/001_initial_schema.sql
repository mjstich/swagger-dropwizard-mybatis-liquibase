--liquibase formatted sql

--changeset mstich:1

-- Lets recreate the tables from scratch
DROP TABLE IF EXISTS pets CASCADE;

-- Table: pets
CREATE TABLE pets
(
  name text NOT NULL,
  status text NOT NULL
);
