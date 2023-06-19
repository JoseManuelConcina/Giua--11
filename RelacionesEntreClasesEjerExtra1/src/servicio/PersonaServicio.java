
package servicio;



import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonaServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void cargarPersona(ArrayList<Persona> personas) {
        Persona persona1 = new Persona("Victoria", "Blanco", 30, 12345678, null);
        personas.add(persona1);
        Persona persona2 = new Persona("Luciano", "Gutierrez", 29, 12345679, null);
        personas.add(persona2);
        Persona persona3 = new Persona("José", "Concina", 40, 12345699, null);
        personas.add(persona3);
        Persona persona4 = new Persona("Damián", "Amaya", 22, 12345630, null);
        personas.add(persona4);
    }

    public static void elegirPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {

        for (Persona aux : personas) {
            System.out.println(aux.getNombre());
            System.out.println("Los perros son : ");
            PerroServicio.mostrarLista(perros);
            System.out.println("¿Qué perro desea adoptar? ");
            String nombre = leer.next();
            Iterator it = perros.iterator();
            Boolean encontrado = false;
            
            while (it.hasNext()) {
                Perro next = (Perro) it.next();
                if (next.getNombre().equals(nombre)) {
                    encontrado = true;
                    System.out.println("El perro ha sido encontrado");
                    
                    if (next.getAdoptado()) {
                        System.out.println("El perro ya ha sido adoptado");
                    } else {
                        System.out.println("Usted ha adoptado al perro " + next.getNombre());

                        next.setAdoptado(Boolean.TRUE);
                        aux.setPerro(next);
                    }

                }

            }
            if(!encontrado) {
                System.out.println("El perro que desea adoptar no se encontró");
            }
        }

    }
}
