package Animales;

public class Terrestre extends Animales {
    private String tipoDeLocomocion;
    private String ultimaComida;
    private String estadoAnimo;

    public Terrestre(String nombre, int edad, String estadoSalud, String tipoDeLocomocion) {
        super(nombre, edad, estadoSalud);
        this.tipoDeLocomocion = tipoDeLocomocion;
        this.ultimaComida = "";
        this.estadoAnimo = "Neutral";
    }

    @Override
    public void alimentar(String comida) {
        this.ultimaComida = comida;
        System.out.println(nombre + " ha sido alimentado con " + comida + ".");
    }

    public void registrarSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
        System.out.println("El estado de salud de " + nombre + " ha sido actualizado a: " + estadoSalud + ".");
    }

    public void registrarComportamiento(String comportamiento) {
        this.estadoAnimo = comportamiento;
        System.out.println("El comportamiento de " + nombre + " ha sido registrado como: " + comportamiento + ".");
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " emite un sonido característico de su especie.");
    }

    public void mover() {
        System.out.println(nombre + " se mueve usando su " + tipoDeLocomocion + ".");
    }

    // Getters y setters adicionales aquí

    public String getUltimaComida() {
        return ultimaComida;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }
}
