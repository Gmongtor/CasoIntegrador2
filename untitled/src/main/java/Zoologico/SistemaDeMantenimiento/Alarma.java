package Zoologico.SistemaDeMantenimiento;
public class Alarma {
    private boolean activa;

    public Alarma() {
        this.activa = false;
    }

    public void activar() {
        activa = true;
        System.out.println("La alarma ha sido activada.");
    }

    public void desactivar() {
        activa = false;
        System.out.println("La alarma ha sido desactivada.");
    }
}


