package Zoologico.Animales;

public class ZoologicoAviario {
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
