CREATE SCHEMA IF NOT EXISTS public;

CREATE TABLE IF NOT EXISTS account
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY,
    username    VARCHAR(30),
    password    VARCHAR(100),
    phone       VARCHAR(30) unique,
    role        VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS product
(
    productId        BIGINT GENERATED ALWAYS AS IDENTITY,
    name             VARCHAR(30),
    description      VARCHAR(100),
    characteristic   VARCHAR(300),
    year             INTEGER,
    id_category      BIGINT,
    id_manufacturer  BIGINT
);

CREATE TABLE IF NOT EXISTS category
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY,
    name       VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS productImages
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY,
    photo      VARCHAR(30),
    id_product BIGINT
);

CREATE TABLE IF NOT EXISTS manufacturer
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY,
    name          VARCHAR(30),
    description   VARCHAR(100)
);
