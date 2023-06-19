package servicio;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JuegoServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        int cont = 0;
        do {
            Jugador j = new Jugador();
            cont++;
            System.out.println("Ingrese nombre de jugador :");
            String nombre = leer.next();
            j.setNombre(nombre);
            jugadores.add(j);
        } while (cont < 6);

    }

    public static void ronda(ArrayList<Jugador> jugadores, Revolver r) {
        boolean mojado = false;
        int cont = 0;
        RevolverServicio.llenarRevolver(r);
        for (Jugador aux : jugadores) {
            System.out.println("Es el turno de " + aux.getNombre());
            RevolverServicio.mojar(r);
            RevolverServicio.siguienteChorro(r);
            RevolverServicio.mostrar(r);
           
            if (Objects.equals(r.getPosicionActual(), r.getPosicionAgua())) {
                aux.setMojado(true);
                System.out.println(aux + " se mojó ");
                mojado = true;
                break;
            } else {
                System.out.println("¡Uff, no te mojaste " + aux + "!");
                cont++;
                r.setPosicionActual(cont);
            }
        }

    }

}
