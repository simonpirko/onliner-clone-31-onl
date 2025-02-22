CREATE SCHEMA IF NOT EXISTS public;

CREATE TABLE IF NOT EXISTS account
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY,
    username    VARCHAR(30),
    login       VARCHAR(30),
    password    VARCHAR(100),
    phone       VARCHAR(30) unique,
    role        VARCHAR(30)
);

CREATE EXTENSION pgcrypto;