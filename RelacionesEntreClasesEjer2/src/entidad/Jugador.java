package entidad;

public class Jugador {

    private static Integer ultimoId = 0;
    private Integer id;
    private String nombre;
    private Boolean mojado;
    

    public Jugador() {
        this.id = ++ultimoId;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{ " + " id = " + id + ", nombre = " + nombre + ", mojado = " + mojado + '}';
    }

}
