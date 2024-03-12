package Zoologico;

import java.util.Scanner;
import Zoologico.Habitats.HabitatAcuatico;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatTerrestre;
import Zoologico.Habitats.Habitats;
import Zoologico.Animales.Terrestre;
import Zoologico.Animales.Acuatico;
import Zoologico.Animales.Aviario;
import Zoologico.Animales.Animales;

import static Zoologico.Animales.ZoologicoTerrestre.mostrarInformacionAnimalTerrestre;

public class Zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Zoológico. ¿Eres 'visitante' o 'staff'?");
        String rol = scanner.nextLine().trim().toLowerCase();

        switch (rol) {
            case "visitante":
                atenderVisitante(scanner);
                break;
            case "staff":
                atenderStaff(scanner);
                break;
            default:
                System.out.println("Rol no reconocido.");
                break;
        }
    }
    private static void atenderVisitanteAnimales(Scanner scanner) {
        System.out.println("Seleccione un hábitat para ver los animales que contiene:");
        System.out.println("1. Terrestre");
        System.out.println("2. Acuático");
        System.out.println("3. Aviario");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

        switch (eleccion) {
            case 1:
                mostrarAnimalesTerrestres();
                break;
            case 2:
                mostrarAnimalesAcuaticos();
                break;
            case 3:
                mostrarAnimalesAviarios();
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                break;
        }
    }

    private static void mostrarAnimalesTerrestres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un animal para ver más información:");
        System.out.println("1. Leon");
        System.out.println("2. Elefante");
        System.out.println("3. Cabra");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

        // Ejemplos de creación de animales terrestres, reemplazar por la implementación real de tus clases
        Terrestre leon = new Terrestre("Leon", 5, "Saludable", "Sabana", "Correr rápido");
        Terrestre elefante = new Terrestre("Elefante", 10, "Saludable", "Selva", "Empujar objetos pesados");
        Terrestre cabraMontes = new Terrestre("Cabra Montes", 3, "Saludable", "Montañas", "Escalar");

        switch (eleccion) {
            case 1:
                System.out.println("Nombre: " + leon.getNombre() + ", Habilidad Especial: " + leon.getHabilidadEspecial());
                break;
            case 2:
                System.out.println("Nombre: " + elefante.getNombre() + ", Habilidad Especial: " + elefante.getHabilidadEspecial());
                break;
            case 3:
                System.out.println("Nombre: " + cabraMontes.getNombre() + ", Habilidad Especial: " + cabraMontes.getHabilidadEspecial());
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                break;
        }
    }

    private static void mostrarAnimalesAcuaticos() {
        // Similar a mostrarAnimalesTerrestres, pero para animales acuáticos
        System.out.println("Mostrando animales del hábitat acuático:");
        System.out.println("Delfín - Habitat: Océano, Habilidad Especial: Saltar fuera del agua");
    }

    private static void mostrarAnimalesAviarios() {
        // Similar a los anteriores, pero para aves
        System.out.println("Mostrando animales del hábitat aviario:");
        System.out.println("Águila - Habitat: Montañas, Habilidad Especial: Vuelo de gran altitud");
    }


    private static void atenderVisitante(Scanner scanner) {
        System.out.println("¿Te gustaría ver 'animales' o 'habitats'?");
        String eleccion = scanner.nextLine().trim().toLowerCase();
        switch (eleccion) {
            case "animales":
                System.out.println("Mostrando información sobre los animales...");
                break;
            case "habitats":
                atenderVisitanteHabitat(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
    private static void atenderVisitanteHabitat(Scanner scanner) {
        System.out.println("¿Qué hábitat te gustaría visitar?");
        System.out.println("1. Terrestre");
        System.out.println("2. Acuático");
        System.out.println("3. Aviario");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

        Habitats habitatSeleccionado = null;
        switch (eleccion) {
            case 1:
                habitatSeleccionado = new HabitatTerrestre(20, 30, true, true);
                break;
            case 2:
                habitatSeleccionado = new HabitatAcuatico(25, 70, true, true);
                break;
            case 3:
                habitatSeleccionado = new HabitatAviario(22, 60, true, true);
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                return; // Salir si la selección no es válida
        }

        if (habitatSeleccionado != null) {
            habitatSeleccionado.mostrarInformacion();
        } else {
            System.out.println("Ha ocurrido un error al seleccionar el hábitat.");
        }
    }

    private static void atenderStaff(Scanner scanner) {
        System.out.println("Selecciona una opción: 'mantenimiento', 'recursos', 'seguridad'");
        String eleccion = scanner.nextLine().trim().toLowerCase();
        switch (eleccion) {
            case "mantenimiento":
                System.out.println("Gestión de mantenimiento...");
                // Aquí podría ir la lógica o método para gestionar el mantenimiento
                break;
            case "recursos":
                System.out.println("Gestión de recursos...");
                // Aquí podría ir la lógica o método para gestionar recursos
                break;
            case "seguridad":
                System.out.println("Gestión de seguridad...");
                // Aquí podría ir la lógica o método para gestionar seguridad
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

