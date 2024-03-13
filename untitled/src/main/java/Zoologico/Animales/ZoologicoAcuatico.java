package Zoologico.Animales;

public class ZoologicoAcuatico {

    public static void main(String[] args) {
        Acuatico pezPayaso = new Acuatico("Pez Payaso", 4, "Buena", "Agresivo", 30, true, "Peces", true, "Hace 3 meses", "Agua Salada", "Nadar entre anémonas");
        Acuatico tortuga = new Acuatico("Tortuga Marina", 5, "Buena", "Tranquilo", 90, true, "Algas", true, "Hace 6 meses", "Agua Salada", "Nadar lento");
        Acuatico mantaRaya = new Acuatico("Manta Raya", 7, "Buena", "Agresivo", 70, true, "Peces", true, "Hace 2 meses", "Agua Salada", "Saltar fuera del agua");

        mostrarInformacionAnimalAcuatico(pezPayaso);
        mostrarInformacionAnimalAcuatico(tortuga);
        mostrarInformacionAnimalAcuatico(mantaRaya);
    }

    private static void mostrarInformacionAnimalAcuatico(Acuatico animal) {
        System.out.println("Nombre: " + animal.getNombre());
        animal.sonidoEspecifico();
        animal.nadar();
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Estado de Salud: " + animal.getEstadoSalud());
        System.out.println("Habitat: " + animal.getTipoHabitat());
        System.out.println("Habilidad Especial: " + animal.getHabilidadEspecial());
        System.out.println("-----------------------------------------");
    }
}
