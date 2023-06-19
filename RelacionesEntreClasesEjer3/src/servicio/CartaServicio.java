package servicio;

import entidad.Carta;
import entidad.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaServicio {

    public static ArrayList llenarMazo(ArrayList mazo) {

        String palo[] = {"ORO", "COPA", "ESPADA", "BASTO"};
        Integer numero[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                Carta carta = new Carta();
                carta.setPalo(palo[i]);
                carta.setNumero(numero[j]);
                mazo.add(carta);
            }
        }

        return mazo;
    }

    public static void mostraMazo(ArrayList mazo) {
        for (Object aux : mazo) {
            System.out.println(aux);
        }

    }

    public static void mezclar(ArrayList mazo) { // Mezclo el ArrayList

        Collections.shuffle(mazo);

    }

    /*
    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
     */
    public static ArrayList siguienteCarta(ArrayList mazo, ArrayList siguiente) {

        if (mazo.size() == 0) {
            System.out.println("Lo siento no hay mas cartas");
        } else {
            System.out.println("La carta dada es :" + mazo.get(0));
        }
        siguiente.add((Carta) mazo.get(0));
        mazo.remove(0);
        return siguiente;
    }

    /*
     cartasDisponibles(): indica el número de cartas que aún se puede repartir
     */
    public static int cartasDisponible(ArrayList mazo) {
        int disponibles = mazo.size();
        System.out.println(mazo.size());
        return disponibles;
    }

    /*
    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
     */
    public static ArrayList darCartas(ArrayList mazo, ArrayList siguiente) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantas cartas desea :");
        int cant = leer.nextInt();
        if (CartaServicio.cartasDisponible(mazo) < cant) {
            System.out.println("Las cartas disponibles no son suficientes ");
        } else {
            for (int i = 0; i < cant; i++) {
                CartaServicio.siguienteCarta(mazo, siguiente);
            }
        }
        return siguiente;

    }

    public static void cartasNoDisponible(ArrayList siguiente) {
        System.out.println(siguiente.size());

    }

}
