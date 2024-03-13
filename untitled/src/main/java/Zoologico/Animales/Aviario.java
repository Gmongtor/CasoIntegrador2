package Zoologico.Animales;

public class Aviario extends Animales {
    private String tipoDeVuelo; // Ejemplo: "Planeador", "Aleteo rápido"
    private String canto; // Ejemplo: "Trino melodioso", "Cacareo fuerte"

    public Aviario(String nombre, int edad, String estadoSalud, String tipoDeVuelo, String canto, String comportamiento, int energia, boolean vacunado, String dieta, boolean cuidadosEspeciales, String ultimoChequeo){
        super(nombre, edad, estadoSalud, comportamiento, energia, vacunado, dieta, cuidadosEspeciales, ultimoChequeo);
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

    @Override
    public void alimentar(String comida) {
        super.alimentar(comida);
        System.out.println(nombre + " pica su comida: " + comida + ".");
    }

    // Getters y Setters
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
        return "Canto: " + canto + ", Vuelo: " + tipoDeVuelo;
    }

    public String getTipoHabitat() {
        return "Aviario";
    }
}
