package Zoologico;

import java.util.Scanner;
import Zoologico.Habitats.HabitatAcuatico;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatTerrestre;
import Zoologico.Habitats.Habitats;

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

    private static void atenderVisitante(Scanner scanner) {
        System.out.println("¿Te gustaría ver 'animales' o 'habitats'?");
        String eleccion = scanner.nextLine().trim().toLowerCase();
        switch (eleccion) {
            case "animales":
                System.out.println("Mostrando información sobre los animales...");
                // Aquí podría ir la lógica o método para mostrar animales
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

