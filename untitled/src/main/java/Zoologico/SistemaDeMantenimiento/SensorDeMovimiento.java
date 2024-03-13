package Zoologico.SistemaDeMantenimiento;
public class SensorDeMovimiento {
    private String id;
    private String ubicacion;

    public SensorDeMovimiento(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado por el sensor " + id + " en " + ubicacion + ".");
    }
}


