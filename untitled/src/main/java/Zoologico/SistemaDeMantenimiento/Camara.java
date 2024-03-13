package Zoologico.SistemaDeMantenimiento;

public class Camara {
    private boolean estaEncendida;

    public Camara() {
        estaEncendida = false;
    }

    public void encender() {
        estaEncendida = true;
        System.out.println("Cámara encendida.");
    }

    public void apagar() {
        estaEncendida = false;
        System.out.println("Cámara apagada.");
    }

    public boolean estaEncendida() {
        return estaEncendida;
    }
}
