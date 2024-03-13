package Zoologico.Animales;

public class ZoologicoAviario {
    public static void main(String[] args) {
        Aviario aguila = new Aviario("Águila", 5, "Buena", "Agresivo", "Alta", true, "Peces", true, "Hace 2 meses", "Vuelo alto", "Grito fuerte");
        Aviario colibri = new Aviario("Colibrí", 2, "Buena", "Tranquilo", "Media", true, "Néctar", true, "Hace 1 mes", "Vuelo rápido", "Zumbido");
        Aviario loro = new Aviario("Loro", 10, "Buena", "Pacifico", "Alta", true, "Frutas", true, "Hace 3 meses", "Vuelo medio", "Habla");

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
