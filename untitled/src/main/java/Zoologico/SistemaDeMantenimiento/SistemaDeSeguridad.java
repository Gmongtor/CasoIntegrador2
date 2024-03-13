package Zoologico.SistemaDeMantenimiento;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeSeguridad {
    private List<Alarma> alarmas;
    private List<SensorDeMovimiento> sensores;
    private List<Camara> camaras;
    private List<ControlAcceso> controlesAcceso;

    public SistemaDeSeguridad() {
        this.alarmas = new ArrayList<>();
        this.sensores = new ArrayList<>();
        this.camaras = new ArrayList<>();
        this.controlesAcceso = new ArrayList<>();
    }

    // Métodos para agregar dispositivos al sistema
    public void agregarAlarma(Alarma alarma) {
        alarmas.add(alarma);
    }

    public void agregarSensor(SensorDeMovimiento sensor) {
        sensores.add(sensor);
    }

    public void agregarCamara(Camara camara) {
        camaras.add(camara);
    }

    public void agregarControlAcceso(ControlAcceso control) {
        controlesAcceso.add(control);
    }

    // Métodos getters
    public List<Alarma> getAlarmas() {
        return alarmas;
    }

    public List<SensorDeMovimiento> getSensores() {
        return sensores;
    }

    public List<Camara> getCamaras() {
        return camaras;
    }

    public List<ControlAcceso> getControlesAcceso() {
        return controlesAcceso;
    }
}


