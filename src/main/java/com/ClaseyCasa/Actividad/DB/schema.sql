DROP DATABASE IF EXISTS actividad;
create database actividad;
use actividad;

create table jugador(
	alias varchar(100) primary key,
    partidas_ganadas int
);

create table partidas(
	id_partida int auto_increment primary key,
    jugador varchar(100),
    iniciada datetime,
    finalizada datetime,
    ganada boolean
);

create table historial(
	id_partida int auto_increment primary key,
    celdaA1 enum('X','0', ' '),
    celdaA2 enum('X','0', ' '),
    celdaA3 enum('X','0', ' '),
    celdaB1 enum('X','0', ' '),
    celdaB2 enum('X','0', ' '),
    celdaB3 enum('X','0', ' '),
    celdaC1 enum('X','0', ' '),
    celdaC2 enum('X','0', ' '),
    celdaC3 enum('X','0', ' ')
);
