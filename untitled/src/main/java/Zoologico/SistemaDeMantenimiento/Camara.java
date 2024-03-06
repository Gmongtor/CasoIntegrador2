package Zoologico.SistemaDeMantenimiento;

public class Camara implements DispositivoSeguridad {
    private String ubicacion;

    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void reportarEvento() {
        System.out.println("Movimiento detectado en la ubicación: " + ubicacion);
    }
}
