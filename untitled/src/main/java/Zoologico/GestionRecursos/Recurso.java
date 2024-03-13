package Zoologico.GestionRecursos;

import java.time.LocalDate;

public class Recurso {
    private String nombre;
    private int cantidad;
    private LocalDate fechaCaducidad;

    public Recurso(String nombre, int cantidad, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }

}


