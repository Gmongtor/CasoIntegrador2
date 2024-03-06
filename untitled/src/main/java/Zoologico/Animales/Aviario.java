package Zoologico.Animales;

public class Aviario extends Animales {
    private String tipoDeVuelo;
    private String canto;

    public Aviario(String nombre, int edad, String estadoSalud, String tipoDeVuelo, String canto) {
        super(nombre, edad, estadoSalud);
        this.tipoDeVuelo = tipoDeVuelo;
        this.canto = canto;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " canta: " + canto + ".");
    }

    public void volar() {
        System.out.println(nombre + " vuela utilizando un " + tipoDeVuelo + " tipo de vuelo.");
    }

    // Implementación de métodos para registrar la alimentación, salud y comportamiento específicos de aves.
    @Override
    public void alimentar(String comida) {
        super.alimentar(comida);
        // Añadir condiciones o comportamientos específicos de alimentación de aves aquí.
        System.out.println(nombre + " pica su comida: " + comida + ".");
    }

    // Métodos getters y setters para tipoDeVuelo y canto aquí
    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }
}
