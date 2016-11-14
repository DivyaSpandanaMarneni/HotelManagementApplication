# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table Employee (
  Eid                       integer auto_increment not null,
  EName                     varchar(255),
  OPhoneNumber              bigint,
  ManagerId                 integer,
  constraint pk_Employee primary key (Eid))
;

create table Guest (
  GuestId                   integer auto_increment not null,
  age                       integer,
  GName                     varchar(255) not null,
  Gender                    varchar(255) not null,
  address                   varchar(255) not null,
  State                     varchar(255),
  constraint pk_Guest primary key (GuestId))
;

create table guest_room_mapping (
  _room_type                varchar(255),
  _no_of_rooms              integer,
  _check_in_dt              date,
  _no_of_days               integer)
;

create table Occupancy (
  ReservationId             integer,
  RoomNumber                integer,
  CheckIn                   date,
  Days                      integer)
;

create table Reservation (
  ReservationId             integer auto_increment not null,
  GuestId                   integer,
  BillAmount                double,
  constraint pk_Reservation primary key (ReservationId))
;

create table Room (
  RoomNumber                integer auto_increment not null,
  RoomType                  varchar(255),
  RPhoneNumber              bigint,
  WaiterId                  integer,
  constraint pk_Room primary key (RoomNumber))
;

create table RoomType (
  RoomType                  varchar(255) not null,
  Price                     double,
  BedsCount                 integer,
  WiFi                      varchar(255),
  Smoking                   varchar(255),
  constraint pk_RoomType primary key (RoomType))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table Employee;

drop table Guest;

drop table guest_room_mapping;

drop table Occupancy;

drop table Reservation;

drop table Room;

drop table RoomType;

SET FOREIGN_KEY_CHECKS=1;

