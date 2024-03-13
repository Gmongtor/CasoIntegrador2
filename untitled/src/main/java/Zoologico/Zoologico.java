package Zoologico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Zoologico.GestionRecursos.Pedidos;
import Zoologico.GestionRecursos.Recurso;
import Zoologico.Habitats.HabitatAcuatico;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatTerrestre;
import Zoologico.Habitats.Habitats;
import Zoologico.Animales.Terrestre;
import Zoologico.Animales.Acuatico;
import Zoologico.Animales.Aviario;
import Zoologico.Animales.Animales;

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
        System.out.println("1. Terrestres");
        System.out.println("2. Acuáticos");
        System.out.println("3. Aviarios");
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
            // Creando instancias de ejemplo para los animales terrestres
            Terrestre leon = new Terrestre("León", 5, "Saludable", "Sabana", "Rey de la selva");
            Terrestre elefante = new Terrestre("Elefante", 10, "Saludable", "Selva", "Empujar objetos pesados");
            Terrestre cabraMontes = new Terrestre("Cabra Montes", 3, "Saludable", "Montañas", "Escalar");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione un animal para ver más información:");
            System.out.println("1. León");
            System.out.println("2. Elefante");
            System.out.println("3. Cabra Montes");
            System.out.print("Elige una opción (1-3): ");

            int eleccion = scanner.nextInt();
            scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

            switch (eleccion) {
                case 1:
                    System.out.println("Nombre: " + leon.getNombre() + ", Habilidad Especial: " + leon.getHabilidadEspecial() + ", Vive en: " + leon.getTipoHabitat());
                    break;
                case 2:
                    System.out.println("Nombre: " + elefante.getNombre() + ", Habilidad Especial: " + elefante.getHabilidadEspecial() + ", Vive en: " + elefante.getTipoHabitat());
                    break;
                case 3:
                    System.out.println("Nombre: " + cabraMontes.getNombre() + ", Habilidad Especial: " + cabraMontes.getHabilidadEspecial() + ", Vive en: " + cabraMontes.getTipoHabitat());
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                    break;
            }

    }

    private static void mostrarAnimalesAcuaticos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un animal para ver más información:");
        System.out.println("1. Pez Payaso");
        System.out.println("2. Tortuga Marina");
        System.out.println("3. Manta Raya");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas
        Acuatico pezPayaso = new Acuatico("Pez Payaso", 2, "Buena", "Agua Salada", "Esconderse entre anémonas");
        Acuatico tortuga = new Acuatico("Tortuga Marina", 50, "Buena", "Agua Salada", "Larga vida");
        Acuatico mantaRaya = new Acuatico("Manta Raya", 5, "Buena", "Agua Salada", "Planea en el agua");
        switch (eleccion) {
            case 1:
                System.out.println("Nombre: " + pezPayaso.getNombre() + ", Habilidad Especial: " + pezPayaso.getHabilidadEspecial() + ". Vive en: " + pezPayaso.getTipoHabitat());
                break;
            case 2:
                System.out.println("Nombre: " + tortuga.getNombre() + ", Habilidad Especial: " + tortuga.getHabilidadEspecial() + ". Vive en: " + tortuga.getTipoHabitat());
                break;
            case 3:
                System.out.println("Nombre: " + mantaRaya.getNombre() + ", Habilidad Especial: " + mantaRaya.getHabilidadEspecial() + ". Vive en: " + mantaRaya.getTipoHabitat());
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                break;
        }
    }

    private static void mostrarAnimalesAviarios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un animal para ver más información:");
        System.out.println("1. Loro");
        System.out.println("2. Colibrí");
        System.out.println("3. Águila");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas
        Aviario loro = new Aviario("Loro", 10, "Buena", "Vuelo versátil", "Imitación de sonidos");
        Aviario colibri = new Aviario("Colibrí", 2, "Buena", "Aleteo rápido", "Zumbido suave");
        Aviario aguila = new Aviario("Águila", 5, "Excelente", "Planeador", "Grito agudo");
        switch (eleccion) {
            case 1:
                System.out.println("Nombre: " + loro.getNombre() + ", Habilidad Especial: " + loro.getHabilidadEspecial() + ". Vive en: " + loro.getTipoHabitat());
                break;
            case 2:
                System.out.println("Nombre: " + colibri.getNombre() + ", Habilidad Especial: " + colibri.getHabilidadEspecial() + ". Vive en: " + colibri.getTipoHabitat());
                break;
            case 3:
                System.out.println("Nombre: " + aguila.getNombre() + ", Habilidad Especial: " + aguila.getHabilidadEspecial() + ". Vive en: " + aguila.getTipoHabitat());
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 3.");
                break;
        }

    }
    private static void atenderVisitante(Scanner scanner) {
        System.out.println("¿Te gustaría ver 'animales' o 'habitats'?");
        String eleccion = scanner.nextLine().trim().toLowerCase();
        switch (eleccion) {
            case "animales":
                atenderVisitanteAnimales(scanner);
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
        System.out.println("Selecciona una opción: 'mantenimiento', 'recursos', 'seguridad' o 'pedidos'");
        String eleccion = scanner.nextLine().trim().toLowerCase();
        switch (eleccion) {
            case "mantenimiento":
                System.out.println("Gestión de mantenimiento...");
                // Aquí podría ir la lógica o método para gestionar el mantenimiento
                break;
            case "recursos":
                gestionarRecursos();
                break;
            case "seguridad":
                System.out.println("Gestión de seguridad...");
                // Aquí podría ir la lógica o método para gestionar seguridad
                break;
            case "pedidos":
                gestionarPedidos(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void gestionarRecursos() {
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Alimento para elefantes", 1000, LocalDate.of(2023, 12, 1)));
        recursos.add(new Recurso("Vacunas para aves", 300, LocalDate.of(2023, 11, 15)));
        recursos.add(new Recurso("Alimento para peces", 500, LocalDate.of(2024, 1, 20)));
        recursos.add(new Recurso("Productos de limpieza", 150, LocalDate.of(2025, 6, 30)));
        recursos.add(new Recurso("Semillas para aves", 800, LocalDate.of(2023, 10, 5)));
        recursos.add(new Recurso("Carne para leones", 200, LocalDate.of(2023, 12, 10)));
        recursos.add(new Recurso("Alimento para tortugas", 400, LocalDate.of(2024, 2, 28)));

        System.out.println("Gestión de Recursos del Zoológico:");
        for (Recurso recurso : recursos) {
            recurso.mostrarInformacion();
            System.out.println();
        }
    }

    private static void gestionarPedidos(Scanner scanner) {
        System.out.println("¿Deseas 'agregar' o 'eliminar' un producto de la lista de pedidos?");
        String accion = scanner.nextLine().trim().toLowerCase();
        System.out.println("Ingresa el nombre del producto:");
        String producto = scanner.nextLine().trim();
        Pedidos pedidos = new Pedidos();
        if ("agregar".equals(accion)) {
            pedidos.agregarProducto(producto);
        } else if ("eliminar".equals(accion)) {
            pedidos.eliminarProducto(producto);
        } else {
            System.out.println("Acción no reconocida.");
        }

        pedidos.mostrarPedidos();
    }
}


