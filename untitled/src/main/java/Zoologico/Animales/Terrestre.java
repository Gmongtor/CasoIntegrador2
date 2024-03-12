package Zoologico.Animales;

public class Terrestre extends Animales {
    private String tipoHabitat; // Ejemplo: "Bosque", "Desierto"
    private String habilidadEspecial; // Ejemplo: "Correr rápido", "Escalada superior"

    public Terrestre(String nombre, int edad, String estadoSalud, String tipoHabitat, String habilidadEspecial) {
        super(nombre, edad, estadoSalud);
        this.tipoHabitat = tipoHabitat;
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " emite un sonido característico de su especie terrestre.");
    }

    public void mover() {
        System.out.println(nombre + " se está moviendo, demostrando su habilidad especial de " + habilidadEspecial + ".");
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }
}

class ZoologicoTerrestre {

    public static void main(String[] args) {
        Terrestre leon = new Terrestre("Leon", 12, "Buena", "Sabana", "Correr rápido");
        Terrestre elefante = new Terrestre("Elefante", 20, "Excelente", "Bosque", "Empuje fuerte");
        Terrestre cabraMontes = new Terrestre("Cabra Montes", 8, "Buena", "Montaña", "Escalada superior");

        mostrarInformacionAnimalTerrestre(leon);
        mostrarInformacionAnimalTerrestre(elefante);
        mostrarInformacionAnimalTerrestre(cabraMontes);
    }

    private static void mostrarInformacionAnimalTerrestre(Terrestre animal) {
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


