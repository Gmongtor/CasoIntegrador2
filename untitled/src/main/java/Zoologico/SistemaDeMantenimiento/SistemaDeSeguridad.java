package Zoologico.SistemaDeMantenimiento;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeSeguridad {
    private List<Camara> camaras;
    private List<SensorDeMovimiento> sensores;
    private Alarma alarma;
    private List<ControlAcceso> controlesAcceso;

    public SistemaDeSeguridad() {
        camaras = new ArrayList<>();
        sensores = new ArrayList<>();
        alarma = new Alarma();
        controlesAcceso = new ArrayList<>();
    }

    public void agregarCamara(Camara camara) {
        camaras.add(camara);
    }

    public void agregarSensor(SensorDeMovimiento sensor) {
        sensores.add(sensor);
    }

    public void agregarControlAcceso(ControlAcceso control) {
        controlesAcceso.add(control);
    }

    public void activarSistema() {
        System.out.println("Activando el sistema de seguridad completo...");
        camaras.forEach(Camara::grabar);
        sensores.forEach(SensorDeMovimiento::detectarMovimiento);
        alarma.activar();
        controlesAcceso.forEach(ControlAcceso::denegarAcceso);
    }

    public void desactivarSistema() {
        System.out.println("Desactivando el sistema de seguridad...");
        alarma.desactivar();
        controlesAcceso.forEach(ControlAcceso::autorizarAcceso);
    }

    public void agregarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    public Iterable<Object> getAlarmas() {
        return null;
    }

    public Iterable<Object> getSensores() {
        return null;
    }

    public Iterable<Object> getCamaras() {
        return null;
    }

    public Iterable<Object> getControlesAcceso() {
        return null;
    }
}

