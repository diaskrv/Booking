-- USER
create sequence user_seq start 1 increment 1;

create table users (
    id int8 not null,
    email varchar(255) not null,
    name varchar(255) not null unique,
    password varchar(255) not null,
    role varchar(255) not null,
    primary key (id)
);
-- CABINET
create sequence cabinet_seq start 1 increment 1;

create table cabinets (
    id int8 not null,
    number_of_cab int not null unique,
    places_number int,
    quadrature int,
    photo varchar(255),
    cabinet_status varchar(255) not null,
    primary key (id)
);
-- BOOKING
create sequence booking_seq start 1 increment 1;

create table bookings (
    id int8 not null,
    user_id int8 references users(id),
    cabinet_id int8 references cabinets(id),
    people_number int,
    created_time timestamp,
    timing timestamp,
    updated_time timestamp,
    booking_status varchar(255) not null,
    primary key (id)
);
