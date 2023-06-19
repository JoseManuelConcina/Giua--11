package servicio;


import entidad.Perro;
import java.util.ArrayList;

public class PerroServicio {

    public static void crearPerro(ArrayList<Perro> perros) {
        Perro perro1 = new Perro("Chiquito", "Beagle", 12, "Mediano", false);
        perros.add(perro1);
        Perro perro2 = new Perro("Filomena", "Boxer", 3, "Mediano", false);
        perros.add(perro2);
        Perro perro3 = new Perro("Lola", "Caniche", 1, "Chico", false);
        perros.add(perro3);
        Perro perro4 = new Perro("Toby", "Golden", 7, "Grande", false);
        perros.add(perro4);

    }

    public static void mostrarLista(ArrayList<Perro> perros) {

        for (Perro aux : perros) {

            System.out.println(aux);
        }
    }

}
