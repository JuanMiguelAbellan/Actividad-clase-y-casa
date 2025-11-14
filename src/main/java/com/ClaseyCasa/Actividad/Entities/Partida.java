package com.ClaseyCasa.Actividad.Entities;

import java.lang.reflect.Array;
import java.util.Date;

public class Partida {

    private int id;
    private Jugador jugador;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean ganada;
    private String[][] tablero = {{" ", " "}, {" ", " "}, {" ", " ", " "}};

    public Partida(int id, Jugador jugador, Date fechaInicio, Date fechaFin, boolean ganada) {
        this.id = id;
        this.jugador = jugador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ganada = ganada;
    }

    public Partida() {
    }

    public int getId() {
        return id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isGanada() {
        return ganada;
    }

    public void setGanada(boolean ganada) {
        this.ganada = ganada;
    }
}
