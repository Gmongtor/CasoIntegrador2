package Zoologico.Animales;

public class ZoologicoAcuatico {

    public static void main(String[] args) {
        Acuatico pezPayaso = new Acuatico("Pez Payaso", 2, "Buena", "Agua Salada", "Esconderse entre anémonas");
        Acuatico tortuga = new Acuatico("Tortuga Marina", 50, "Buena", "Agua Salada", "Larga vida");
        Acuatico mantaRaya = new Acuatico("Manta Raya", 5, "Buena", "Agua Salada", "Planea en el agua");

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
