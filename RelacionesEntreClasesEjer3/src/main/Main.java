package main;

import entidad.Carta;
import java.util.ArrayList;
import servicio.CartaServicio;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Carta> mazo = new ArrayList();
        ArrayList<Carta> siguiente = new ArrayList();
        CartaServicio.llenarMazo(mazo);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.mostraMazo(mazo);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.mezclar(mazo);
        System.out.println("Mezclando el mazo....");
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.mostraMazo(mazo);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.siguienteCarta(mazo, siguiente);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.cartasDisponible(mazo);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.darCartas(mazo, siguiente);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.cartasNoDisponible(siguiente);
        System.out.println("---------------------------------------------------------------------------");
        CartaServicio.cartasDisponible(mazo);
    }
    
}
