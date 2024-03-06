package Zoologico.SistemaDeMantenimiento;

public class SensorMovimiento implements DispositivoSeguridad {
    private String ubicacion;

    public SensorMovimiento(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void reportarEvento() {
        System.out.println("Acceso no autorizado detectado en la ubicación: " + ubicacion);
    }
}
