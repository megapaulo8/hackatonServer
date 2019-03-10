create table person_role
(
	id serial not null
		constraint user_role_pk
			primary key,
	name varchar(255) not null
);

create unique index user_role_id_uindex
	on person_role (id);

create table city
(
	id serial not null
		constraint city_pk
			primary key,
	name varchar(255) not null,
	state_abbreviation varchar(2) not null
);

create table neighborhood
(
	id serial not null
		constraint neighborhood_pk
			primary key,
	name varchar(255) not null,
	city_id integer not null
		constraint neighborhood_city_id_fk
			references city
			on delete cascade
);

create table address
(
	id serial not null
		constraint address_pk
			primary key,
	cep varchar(255),
	street varchar(255),
	complement varchar(255),
	number integer,
	neighborhood_id integer
		constraint address_neighborhood_id_fk
			references neighborhood
			on delete cascade
);

create table person
(
	id serial not null
		constraint user_pk
			primary key,
	full_name varchar(255) not null,
	email varchar(255),
	phone varchar(255),
	cpf varchar(255),
	picture_path varchar(255),
	password varchar(255),
	register_date timestamp,
	is_active boolean,
	address_id integer
		constraint user_address_id_fk
			references address
);

create unique index user_id_uindex
	on person (id);

create table people_roles
(
	user_id integer not null
		constraint users_profiles_users_id_fk
			references person
			on delete cascade,
	role_id integer not null
		constraint users_profiles_user_role_id_fk
			references person_role
			on delete cascade
);

create unique index address_id_uindex
	on address (id);

create unique index neighborhood_id_uindex
	on neighborhood (id);

create unique index city_id_uindex
	on city (id);

create table property_category
(
	id serial not null
		constraint property_category_pk
			primary key,
	name varchar(255)
);

create unique index property_category_id_uindex
	on property_category (id);

create table property
(
	id serial not null
		constraint property_pk
			primary key,
	user_id integer not null
		constraint property_user_id_fk
			references person
			on delete cascade,
	category_id integer not null
		constraint property_property_category_id_fk
			references property_category,
	description varchar(255),
	contract_type varchar(255),
	score double precision,
	view_count integer,
	address_id integer not null
		constraint property_address_id_fk
			references address,
	code varchar(255)
);

create unique index property_id_uindex
	on property (id);

create table contract
(
	user_id integer not null
		constraint contract_user_id_fk
			references person
			on delete cascade,
	property_id integer not null
		constraint contract_property_id_fk
			references property,
	contract_code varchar(255) not null,
	id serial not null
		constraint contract_pk
			primary key
);

create unique index contract_contract_code_uindex
	on contract (contract_code);

create unique index contract_id_uindex
	on contract (id);

create table report
(
	id serial not null
		constraint report_pk
			primary key,
	user_id integer not null
		constraint report_user_id_fk
			references person
			on delete cascade,
	property_id integer not null
		constraint report_property_id_fk
			references property,
	date timestamp not null
);

create unique index report_id_uindex
	on report (id);

create table specification
(
	id serial not null
		constraint specification_pk
			primary key,
	name varchar(255) not null,
	type varchar(255) not null
);

create unique index specification_id_uindex
	on specification (id);

create table properties_specifications
(
	property_id integer not null
		constraint properties_specifications_property_id_fk
			references property,
	specification_id integer not null
		constraint properties_specifications_specification_id_fk
			references specification,
	id serial not null
		constraint properties_specifications_pk
			primary key
);

create unique index properties_specifications_id_uindex
	on properties_specifications (id);

create table neighborhoods_specifications
(
	neighborhood_id integer not null
		constraint neighborhoods_specifications_neighborhood_id_fk
			references neighborhood,
	specification_id integer not null
		constraint neighborhoods_specifications_specification_id_fk
			references specification,
	id serial not null
		constraint neighborhoods_specifications_pk
			primary key
);

create unique index neighborhoods_specifications_id_uindex
	on neighborhoods_specifications (id);

create table room_type
(
	id serial not null
		constraint room_type_pk
			primary key,
	name varchar(255) not null
);

create unique index room_type_id_uindex
	on room_type (id);

create table properties_rooms
(
	id serial not null
		constraint properties_rooms_pk
			primary key,
	name varchar(255) not null,
	property_id integer not null
		constraint properties_rooms_property_id_fk
			references property,
	type_id integer not null
		constraint properties_rooms_room_type_id_fk
			references room_type,
	photo_path varchar(255) not null
);

create unique index properties_rooms_id_uindex
	on properties_rooms (id);

create table rooms_items
(
	id serial not null
		constraint rooms_items_pk
			primary key,
	room_id integer not null
		constraint rooms_items_properties_rooms_id_fk
			references properties_rooms,
	name varchar(255) not null,
	color varchar(255),
	quantity integer,
	grade integer not null
);

create unique index rooms_items_id_uindex
	on rooms_items (id);

create table credit_cards
(
	id serial not null
		constraint credit_cards_pk
			primary key,
	number varchar(255) not null,
	expiration_date varchar(255) not null,
	security_code integer not null,
	user_id integer not null
		constraint credit_cards_person_id_fk
			references person
);

create unique index credit_cards_id_uindex
	on credit_cards (id);

create table bank_account
(
	id serial not null
		constraint bank_account_pk
			primary key,
	bank_name varchar(255) not null,
	agency varchar(255) not null,
	account varchar(255) not null,
	account_type varchar(255) not null,
	user_id integer not null
		constraint bank_account_person_id_fk
			references person
);

create unique index bank_account_id_uindex
	on bank_account (id);

create table payment
(
	id serial not null
		constraint payment_pk
			primary key,
	user_id integer not null
		constraint payment_person_id_fk
			references person,
	amount double precision not null,
	status varchar(255) not null
);

create unique index payment_id_uindex
	on payment (id);

create table visit
(
	id serial not null
		constraint visit_pk
			primary key,
	propriety_id integer not null
		constraint visit_property_id_fk
			references property,
	user_id integer
		constraint visit_person_id_fk
			references person,
	scheduled_time timestamp not null,
	status varchar(255) not null,
	review integer not null,
	payment_method varchar(255),
	change double precision
);

create unique index visit_id_uindex
	on visit (id);

