
package entidad;

public class Perro {
    // nombre, raza, edad y tamaño; 
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
}
