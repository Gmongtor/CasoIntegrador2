package Zoologico.SistemaDeMantenimiento;

public class Camara {
    private String id;
    private String ubicacion;

    public Camara(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }

    public void grabar() {
        System.out.println("La cámara " + id + " en " + ubicacion + " está grabando.");
    }
}

