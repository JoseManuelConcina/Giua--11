package main;

import entidad.Perro;
import entidad.Persona;

public class Main {

    public static void main(String[] args) {
        Perro p1 = new Perro("Kratos", "Pit Bulls", 7, "Grande");
        Perro p2 = new Perro("Prue", "Pit Bulls", 5, "Mediana");
        Persona per1 = new Persona("Jose", "Lopez", 30, "39345985", p1);
        Persona per2 = new Persona("Maria", "Sanchez", 50, "24543985", p2);

        System.out.println("A " + per1 );
        System.out.println("-------------------------------------------------------------");
        System.out.println("A " + per2 );
    }

}
