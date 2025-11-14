package com.ClaseyCasa.Actividad.Entities;

public class Jugador {

    private String alias;
    private int partidasGanadas;

    public Jugador() {
    }

    public Jugador(String alias, int partidasGanadas) {
        this.alias = alias;
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
