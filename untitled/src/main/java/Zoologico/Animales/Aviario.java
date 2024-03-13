package Zoologico.Animales;

public class Aviario extends Animales {
    private String tipoDeVuelo;
    private String canto;

    // Ajusta el constructor según los nuevos campos en Animales
    public Aviario(String nombre, int edad, String estadoSalud, String comportamiento, int energia, boolean vacunado, String dieta, boolean cuidadosEspeciales, String ultimoChequeo, String tipoDeVuelo, String canto) {
        super(nombre, edad, estadoSalud, comportamiento, energia, vacunado, dieta, cuidadosEspeciales, ultimoChequeo);
        this.tipoDeVuelo = tipoDeVuelo;
        this.canto = canto;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(getNombre() + " canta: " + canto + ".");
    }

    public void volar() {
        System.out.println(getNombre() + " vuela utilizando un " + tipoDeVuelo + " tipo de vuelo.");
    }

    // Getters y setters
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

    public String getHabilidadEspecial() {
        return null;
    }

    public String getTipoHabitat() {
        return null;
    }
}

