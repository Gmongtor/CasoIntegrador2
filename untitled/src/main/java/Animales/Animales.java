package Animales;
public abstract class Animales {
    protected String nombre;
    protected int edad;
    protected String estadoSalud;
    protected String comportamiento;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = "Buena";
        this.comportamiento = "Normal";
    }

    public void alimentar(String comida) {
        System.out.println(nombre + " ha sido alimentado con " + comida + ".");
    }

    public void registrarSalud(String estado) {
        this.estadoSalud = estado;
        System.out.println("El estado de salud de " + nombre + " es ahora: " + estado + ".");
    }

    public void registrarComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
        System.out.println("El comportamiento de " + nombre + " es ahora: " + comportamiento + ".");
    }

    public abstract void sonidoEspecifico();

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
}
