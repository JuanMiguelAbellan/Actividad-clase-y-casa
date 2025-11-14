package com.ClaseyCasa.Actividad.DAO.partida;

import com.ClaseyCasa.Actividad.Entities.Jugador;
import com.ClaseyCasa.Actividad.Entities.Partida;

import java.util.List;

public interface DAOPartida {
    List<Partida> getPartidas();
    Partida getPartida(int id);
    Partida addPartida(Partida nueva);
    Jugador getJugador(String alias);
    Partida getHistorial(int id);
}
