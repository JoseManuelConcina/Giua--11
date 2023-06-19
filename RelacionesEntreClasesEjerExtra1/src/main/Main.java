package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {



        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        PerroServicio.crearPerro(perros);
       // PerroServicio.mostrarLista(perros);

        PersonaServicio.cargarPersona(personas);

        PersonaServicio.elegirPerro(personas, perros);

    }

}
