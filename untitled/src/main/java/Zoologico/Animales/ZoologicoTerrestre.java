package Zoologico.Animales;

public class ZoologicoTerrestre {

    public static void main(String[] args) {
        Terrestre leon = new Terrestre("Leon", 12, "Buena", "Sabana", "Correr rápido");
        Terrestre elefante = new Terrestre("Elefante", 20, "Excelente", "Bosque", "Empuje fuerte");
        Terrestre cabraMontes = new Terrestre("Cabra Montes", 8, "Buena", "Montaña", "Escalada superior");

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
