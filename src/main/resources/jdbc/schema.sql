CREATE SCHEMA IF NOT EXISTS public;

create table if not exists accounts
(
    id       uuid default gen_random_uuid() not null
        constraint accounts_pk
            primary key,
    username varchar                        not null,
    password text                           not null,
    phone    varchar                        not null,
    photo    text,
    role     integer                        not null
);

create table if not exists users
(
    id       uuid default gen_random_uuid() not null
    constraint users_pk
    primary key,
    username varchar                        not null,
    phone    varchar                        not null,
    role     integer                        not null
    );

create table if not exists manufacturers
(
    id          uuid default gen_random_uuid() not null
        constraint manufacturers_pk
            primary key,
    name        varchar                        not null,
    description text
);

create table if not exists models
(
    id              uuid default gen_random_uuid() not null
        constraint models_pk
            primary key,
    name            varchar                        not null,
    manufacturer_id uuid                           not null
        constraint models_manufacturers_id_fk
            references manufacturers
);


create table if not exists categories
(
    id   uuid default gen_random_uuid() not null
        constraint categories_pk
            primary key,
    name varchar                        not null
);

create table if not exists products
(
    id              uuid default gen_random_uuid() not null
        constraint products_pk
            primary key,
    category_id     uuid                           not null
        constraint products_categories_id_fk
            references categories,
    characteristics json                           not null,
    year            integer                        not null,
    model_id        uuid                           not null
        constraint products_models_id_fk
            references models (id),
    description     text                           not null
);

create table if not exists product_images
(
    id         uuid default gen_random_uuid() not null
        constraint product_images_pk
            primary key,
    product_id uuid                           not null
        constraint product_images_products_id_fk
            references products,
    path       varchar                        not null
);

create table if not exists carts
(
    id         uuid      default gen_random_uuid() not null
        constraint carts_pk
            primary key,
    account_id uuid                                not null
        constraint carts_accounts_id_fk
            references accounts,
    updated_at timestamp default current_timestamp not null
);

create table if not exists shops
(
    id          uuid default gen_random_uuid() not null
        constraint shops_pk
            primary key,
    name        varchar                        not null,
    description text                           not null,
    address     text                           not null,
    account_id  uuid                           not null
        constraint shops_accounts_id_fk
            references accounts
);

create table if not exists orders
(
    id          uuid      default gen_random_uuid() not null
        constraint orders_pk
            primary key,
    status      integer                             not null,
    account_id  uuid                                not null
        constraint orders_accounts_id_fk
            references accounts,
    shop_id     uuid                                not null
        constraint orders_shops_id_fk
            references shops,
    updated_at  timestamp default current_timestamp not null,
    description text,
    address     text                                not null
);

create table if not exists shop_products
(
    id         uuid      default gen_random_uuid() not null
        constraint shop_products_pk
            primary key,
    shop_id    uuid                                not null
        constraint shop_products_shops_id_fk
            references shops,
    product_id uuid                                not null
        constraint shop_products_products_id_fk
            references products,
    price      decimal                             not null,
    status     integer                             not null,
    updated_at timestamp default current_timestamp not null
);

create table if not exists cart_items
(
    id              uuid default gen_random_uuid() not null
        constraint cart_items_pk
            primary key,
    cart_id         uuid                           not null
        constraint cart_items_carts_id_fk
            references carts,
    shop_product_id uuid                           not null
        constraint cart_items_shop_products_id_fk
            references shop_products
);

create table if not exists order_details
(
    id              uuid default gen_random_uuid() not null
        constraint order_details_pk
            primary key,
    order_id        uuid                           not null
        constraint order_details_orders_id_fk
            references orders,
    shop_product_id uuid                           not null
        constraint order_details_shop_products_id_fk
            references shop_products,
    price           decimal                        not null
);