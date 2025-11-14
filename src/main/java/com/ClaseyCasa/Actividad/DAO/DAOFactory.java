package com.ClaseyCasa.Actividad.DAO;

import com.ClaseyCasa.Actividad.DAO.jugador.DAOJugador;
import com.ClaseyCasa.Actividad.DAO.jugador.DAOJugadorSQL;
import com.ClaseyCasa.Actividad.DAO.partida.DAOPartida;
import com.ClaseyCasa.Actividad.DAO.partida.DAOPartidaSQL;

public class DAOFactory {
    private static final DAOFactory daoFactory = new DAOFactory();
    private DAOJugador daoJugador;
    private DAOPartida daoPartida;

    private DAOFactory(){}

    public static DAOFactory getInstance() {
        return daoFactory;
    }

    public DAOJugador getDaoJugador(){
        if(daoJugador == null){
            daoJugador = new DAOJugadorSQL();
        }
        return daoJugador;
    }

    public DAOPartida getDaoPartida(){
        if(daoPartida == null){
            daoPartida = new DAOPartidaSQL();
        }
        return daoPartida;
    }
}
