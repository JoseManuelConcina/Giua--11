package entidad;

import java.util.ArrayList;
import servicio.JuegoServicio;


public class Main {

    public static void main(String[] args) {
        Revolver r = new Revolver();
        ArrayList<Jugador> jugadores = new ArrayList();
        JuegoServicio.llenarJuego(jugadores, r);
        JuegoServicio.ronda(jugadores, r);
    }

}
