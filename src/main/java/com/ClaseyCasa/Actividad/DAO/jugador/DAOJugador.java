package com.ClaseyCasa.Actividad.DAO.jugador;

import com.ClaseyCasa.Actividad.Entities.Jugador;

import java.util.List;

public interface DAOJugador {
    Jugador getJugador(String alias);
    List<Jugador> getJugadores();
    int getPartidasGanadas(String alias);
    Jugador addJugador(String alias);
}
