package Zoologico.Animales;

public class ZoologicoTerrestre {

    public static void main(String[] args) {
        Terrestre leon = new Terrestre("Leon", 12, "Bueno", "Sabana", "Correr rápido", "Agresivo", 10, true, "Carne", false, "Hace 1 mes");
        Terrestre elefante = new Terrestre("Elefante", 20, "Excelente", "Selva", "Fuerza superior", "Tranquilo", 8, true, "Hierba", true, "Hace 2 meses");
        Terrestre cabraMontes = new Terrestre("Cabra Montes", 8, "Buena", "Montañas", "Escalada superior", "Agresivo", 9, true, "Hierba", false, "Hace 3 meses");

        mostrarInformacionAnimalTerrestre(leon);
        mostrarInformacionAnimalTerrestre(elefante);
        mostrarInformacionAnimalTerrestre(cabraMontes);
    }

    public static void mostrarInformacionAnimalTerrestre(Terrestre animal) {
        System.out.println("Nombre: " + animal.getNombre());
        animal.sonidoEspecifico();
        animal.mover();
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Estado de Salud: " + animal.getEstadoSalud());
        System.out.println("Habitat: " + animal.getTipoHabitat());
        System.out.println("Habilidad Especial: " + animal.getHabilidadEspecial());
        System.out.println("-----------------------------------------");
    }
}
