CREATE SCHEMA IF NOT EXISTS public;

create table if not exists account
(
    id             uuid default gen_random_uuid() not null constraint accounts_pk primary key,
    username       varchar(30) not null,
    password       varchar not null,
    phone          varchar not null unique,
    role           varchar(10),
    photo          varchar(40)
);

create table if not exists manufacturer
(
    id             uuid default gen_random_uuid() not null constraint manufacturers_pk primary key,
    name           varchar not null,
    description    text
);


create table if not exists category
(
    id              uuid default gen_random_uuid() not null constraint categories_pk primary key,
    name            varchar(30) not null
);

create table if not exists product
(
    id              uuid default gen_random_uuid() not null constraint products_pk primary key,
    name            varchar(30) not null,
    category_id     uuid not null constraint products_categories_id_fk references category,
    characteristics text not null,
    year            integer not null,
    manufacturer_id uuid not null constraint products_manufacturer_id_fk references manufacturer (id),
    description     text not null
);

create table if not exists productImages
(
    id              uuid default gen_random_uuid() not null constraint product_images_pk primary key,
    path            varchar not null
);

create table if not exists cart
(
    id              uuid default gen_random_uuid() not null constraint carts_pk primary key,
    account_id      uuid not null constraint carts_accounts_id_fk references account,
    updated_at      timestamp default current_timestamp not null
);

create table if not exists shop
(
    id              uuid default gen_random_uuid() not null constraint shops_pk primary key,
    name            varchar not null,
    description     text not null,
    address         text not null,
    account_id      uuid not null constraint shops_accounts_id_fk references account
);

create table if not exists orders
(
    id              uuid default gen_random_uuid() not null constraint orders_pk primary key,
    status          integer not null,
    account_id      uuid not null constraint order_accounts_id_fk references account,
    shop_id         uuid not null constraint order_shops_id_fk references shop,
    updated_at      timestamp default current_timestamp not null,
    description     text,
    address         text not null
);

create table if not exists shopProduct
(
    id              uuid default gen_random_uuid() not null constraint shop_products_pk primary key,
    shop_id         uuid not null constraint shop_products_shops_id_fk references shop,
    product_id      uuid not null constraint shop_products_products_id_fk references product,
    price           decimal not null,
    status          integer not null,
    updated_at      timestamp default current_timestamp not null
);

create table if not exists cartItem
(
    id              uuid default gen_random_uuid() not null constraint cart_items_pk primary key,
    cart_id         uuid not null constraint cart_items_carts_id_fk references cart,
    shop_product_id uuid not null constraint cart_items_shop_products_id_fk references shopProduct
);

create table if not exists orderDetails
(
    id              uuid default gen_random_uuid() not null constraint order_details_pk primary key,
    order_id        uuid not null constraint order_details_orders_id_fk references orders,
    shop_product_id uuid not null constraint order_details_shop_products_id_fk references shopProduct,
    price           decimal not null
);