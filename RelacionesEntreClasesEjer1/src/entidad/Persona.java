
package entidad;


public class Persona {
    // nombre, apellido, edad, documento y Perro.
    private String nombre;
    private String apellido;
    private Integer edad;
    private String documento;
    private Perro p;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, String documento, Perro p) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public Perro getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", p=" + p + '}';
    }
    
              
}
