package Zoologico.SistemaDeMantenimiento;
public class ControlAcceso {
    private String puerta;

    public ControlAcceso(String puerta) {
        this.puerta = puerta;
    }

    public void autorizarAcceso() {
        System.out.println("Acceso autorizado a través de " + puerta + ".");
    }

    public void denegarAcceso() {
        System.out.println("Acceso denegado a " + puerta + ".");
    }
}

