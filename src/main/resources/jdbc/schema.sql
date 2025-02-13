CREATE SCHEMA IF NOT EXISTS public;

CREATE TABLE IF NOT EXISTS account
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY,
    username    VARCHAR(30) unique,
    login       VARCHAR(30),
    password    VARCHAR(30),
    phone       VARCHAR(30),
    role        VARCHAR(30)
);