package Zoologico.Animales;

public class Aviario extends Animales {
    private String tipoDeVuelo; // Ejemplo: "Planeador", "Aleteo rápido"
    private String canto; // Ejemplo: "Trino melodioso", "Cacareo fuerte"

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
}
class ZoologicoAviario {
    public static void main(String[] args) {
        Aviario aguila = new Aviario("Águila", 5, "Excelente", "Planeador", "Grito agudo");
        Aviario colibri = new Aviario("Colibrí", 2, "Buena", "Aleteo rápido", "Zumbido suave");
        Aviario loro = new Aviario("Loro", 10, "Buena", "Vuelo versátil", "Imitación de sonidos");

        mostrarInformacionAviario(aguila);
        mostrarInformacionAviario(colibri);
        mostrarInformacionAviario(loro);
    }

    private static void mostrarInformacionAviario(Aviario ave) {
        System.out.println("Nombre: " + ave.getNombre());
        ave.sonidoEspecifico();
        ave.volar();
        System.out.println("Edad: " + ave.getEdad() + " años");
        System.out.println("Estado de Salud: " + ave.getEstadoSalud());
        System.out.println("Tipo de Vuelo: " + ave.getTipoDeVuelo());
        System.out.println("Canto: " + ave.getCanto());
        System.out.println("-----------------------------------------");
    }
}
