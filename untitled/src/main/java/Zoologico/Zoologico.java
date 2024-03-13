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
            Terrestre leon = new Terrestre("Leon", 12, "Bueno", "Sabana", "Correr rápido", "Agresivo", 10, true, "Carne", false, "Hace 1 mes");
            Terrestre elefante = new Terrestre("Elefante", 20, "Excelente", "Selva", "Fuerza superior", "Tranquilo", 80, true, "Hierba", true, "Hace 2 meses");
            Terrestre cabraMontes = new Terrestre("Cabra Montes", 8, "Buena", "Montañas", "Escalada superior", "Agresivo", 70, true, "Hierba", false, "Hace 3 meses");
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
        Acuatico pezPayaso = new Acuatico("Pez Payaso", 2, "Buena", "Agresivo", 70, true, "Peces", true, "Hace 3 meses", "Agua Salada", "Nadar entre anémonas");
        Acuatico tortuga = new Acuatico("Tortuga Marina", 50, "Buena", "Tranquilo", 20, true, "Algas", true, "Hace 6 meses", "Agua Salada", "Nadar lento");
        Acuatico mantaRaya = new Acuatico("Manta Raya", 5, "Buena", "Agresivo", 10, true, "Peces", true, "Hace 2 meses", "Agua Salada", "Saltar fuera del agua");
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
        scanner.nextLine();
        Aviario loro = new Aviario("Loro", 10, "Buena", "Pacifico", 50, true, "Frutas", true, "Hace 3 meses", "Vuelo medio", "Habla");
        Aviario colibri = new Aviario("Colibrí", 2, "Buena", "Tranquilo", 100, true, "Néctar", true, "Hace 1 mes", "Vuelo rápido", "Zumbido");
        Aviario aguila = new Aviario("Águila", 5, "Buena", "Agresivo", 20, true, "Peces", true, "Hace 2 meses", "Vuelo alto", "Grito fuerte");
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
                atenderStaffMantenimiento(scanner);
                break;
            case "recursos":
                gestionarRecursos();
                break;
            case "seguridad":
                System.out.println("Gestión de seguridad...");
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
    private static void atenderStaffMantenimiento(Scanner scanner) {
        System.out.println("¿Qué tipo de mantenimiento deseas realizar?");
        System.out.println("1. Animales");
        System.out.println("2. Hábitats");
        System.out.print("Elige una opción (1-2): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

        switch (eleccion) {
            case 1:
                atenderStaffMantenimientoAnimales(scanner);
                break;
            case 2:
                atenderStaffHabitat(scanner);
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 2.");
                break;
        }
    }
    private static void atenderStaffHabitat(Scanner scanner) {
        System.out.println("¿Qué hábitat te gustaría visitar?");
        System.out.println("1. Terrestre");
        System.out.println("2. Acuático");
        System.out.println("3. Aviario");
        System.out.print("Elige una opción (1-3): ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();

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
                return;
        }

        if (habitatSeleccionado != null) {
            habitatSeleccionado.mostrarInformacion();
        } else {
            System.out.println("Ha ocurrido un error al seleccionar el hábitat.");
        }
    }

    private static void atenderStaffMantenimientoAnimales(Scanner scanner) {
        System.out.println("Seleccione el animal para ver su información de mantenimiento:");
        System.out.println("1. León");
        System.out.println("2. Elefante");
        System.out.println("3. Cabra Montes");
        System.out.println("4. Pez Payaso");
        System.out.println("5. Tortuga Marina");
        System.out.println("6. Manta Raya");
        System.out.println("7. Loro");
        System.out.println("8. Colibrí");
        System.out.println("9. Águila");
        System.out.print("Elige una opción (1-9): ");

        int eleccion = scanner.nextInt();
        Terrestre leon = new Terrestre("Leon", 12, "Bueno", "Sabana", "Correr rápido", "Agresivo", 10, true, "Carne", false, "Hace 1 mes");
        Terrestre elefante = new Terrestre("Elefante", 20, "Excelente", "Selva", "Fuerza superior", "Tranquilo", 8, true, "Hierba", true, "Hace 2 meses");
        Terrestre cabraMontes = new Terrestre("Cabra Montes", 8, "Buena", "Montañas", "Escalada superior", "Agresivo", 9, true, "Hierba", false, "Hace 3 meses");
        Acuatico pezPayaso = new Acuatico("Pez Payaso", 4, "Buena", "Agresivo", 30, true, "Peces", true, "Hace 3 meses", "Agua Salada", "Nadar entre anémonas");
        Acuatico tortuga = new Acuatico("Tortuga Marina", 5, "Buena", "Tranquilo", 90, true, "Algas", true, "Hace 6 meses", "Agua Salada", "Nadar lento");
        Acuatico mantaRaya = new Acuatico("Manta Raya", 7, "Buena", "Agresivo", 70, true, "Peces", true, "Hace 2 meses", "Agua Salada", "Saltar fuera del agua");
        Aviario loro = new Aviario("Loro", 10, "Buena", "Pacifico", 50, true, "Frutas", true, "Hace 3 meses", "Vuelo medio", "Habla");
        Aviario colibri = new Aviario("Colibrí", 2, "Buena", "Tranquilo", 100, true, "Néctar", true, "Hace 1 mes", "Vuelo rápido", "Zumbido");
        Aviario aguila = new Aviario("Águila", 5, "Buena", "Agresivo", 20, true, "Peces", true, "Hace 2 meses", "Vuelo alto", "Grito fuerte");

        scanner.nextLine();
        switch (eleccion) {
            case 1:
                System.out.println("Nombre: " + leon.getNombre() + ", Habilidad Especial: " + leon.getHabilidadEspecial() + ", Vive en: " + leon.getTipoHabitat() + ", Estado de Salud: " + leon.getEstadoSalud() + ", Último chequeo: " + leon.getUltimoChequeo() + ", Dieta: " + leon.getDieta() + ", Cuidados Especiales: " + leon.isCuidadosEspeciales() + ", Vacunado: " + leon.isVacunado() + ", Energía: " + leon.getEnergia() + ", Comportamiento: " + leon.getComportamiento() + ", Edad: " + leon.getEdad() + " años");
                break;
            case 2:
                System.out.println("Nombre: " + elefante.getNombre() + ", Habilidad Especial: " + elefante.getHabilidadEspecial() + ", Vive en: " + elefante.getTipoHabitat() + ", Estado de Salud: " + elefante.getEstadoSalud() + ", Último chequeo: " + elefante.getUltimoChequeo() + ", Dieta: " + elefante.getDieta() + ", Cuidados Especiales: " + elefante.isCuidadosEspeciales() + ", Vacunado: " + elefante.isVacunado() + ", Energía: " + elefante.getEnergia() + ", Comportamiento: " + elefante.getComportamiento() + ", Edad: " + elefante.getEdad() + " años");
                break;
            case 3:
                System.out.println("Nombre: " + cabraMontes.getNombre() + ", Habilidad Especial: " + cabraMontes.getHabilidadEspecial() + ", Vive en: " + cabraMontes.getTipoHabitat() + ", Estado de Salud: " + cabraMontes.getEstadoSalud() + ", Último chequeo: " + cabraMontes.getUltimoChequeo() + ", Dieta: " + cabraMontes.getDieta() + ", Cuidados Especiales: " + cabraMontes.isCuidadosEspeciales() + ", Vacunado: " + cabraMontes.isVacunado() + ", Energía: " + cabraMontes.getEnergia() + ", Comportamiento: " + cabraMontes.getComportamiento() + ", Edad: " + cabraMontes.getEdad() + " años");
                break;
            case 4:
                System.out.println("Nombre: " + pezPayaso.getNombre() + ", Habilidad Especial: " + pezPayaso.getHabilidadEspecial() + ", Vive en: " + pezPayaso.getTipoHabitat() + ", Estado de Salud: " + pezPayaso.getEstadoSalud() + ", Último chequeo: " + pezPayaso.getUltimoChequeo() + ", Dieta: " + pezPayaso.getDieta() + ", Cuidados Especiales: " + pezPayaso.isCuidadosEspeciales() + ", Vacunado: " + pezPayaso.isVacunado() + ", Energía: " + pezPayaso.getEnergia() + ", Comportamiento: " + pezPayaso.getComportamiento() + ", Edad: " + pezPayaso.getEdad() + " años");
                break;
            case 5:
                System.out.println("Nombre: " + tortuga.getNombre() + ", Habilidad Especial: " + tortuga.getHabilidadEspecial() + ", Vive en: " + tortuga.getTipoHabitat() + ", Estado de Salud: " + tortuga.getEstadoSalud() + ", Último chequeo: " + tortuga.getUltimoChequeo() + ", Dieta: " + tortuga.getDieta() + ", Cuidados Especiales: " + tortuga.isCuidadosEspeciales() + ", Vacunado: " + tortuga.isVacunado() + ", Energía: " + tortuga.getEnergia() + ", Comportamiento: " + tortuga.getComportamiento() + ", Edad: " + tortuga.getEdad() + " años");
                break;
            case 6:
                System.out.println("Nombre: " + mantaRaya.getNombre() + ", Habilidad Especial: " + mantaRaya.getHabilidadEspecial() + ", Vive en: " + mantaRaya.getTipoHabitat() + ", Estado de Salud: " + mantaRaya.getEstadoSalud() + ", Último chequeo: " + mantaRaya.getUltimoChequeo() + ", Dieta: " + mantaRaya.getDieta() + ", Cuidados Especiales: " + mantaRaya.isCuidadosEspeciales() + ", Vacunado: " + mantaRaya.isVacunado() + ", Energía: " + mantaRaya.getEnergia() + ", Comportamiento: " + mantaRaya.getComportamiento() + ", Edad: " + mantaRaya.getEdad() + " años");
                break;
            case 7:
                System.out.println("Nombre: " + loro.getNombre() + ", Habilidad Especial: " + loro.getHabilidadEspecial() + ", Vive en: " + loro.getTipoHabitat() + ", Estado de Salud: " + loro.getEstadoSalud() + ", Último chequeo: " + loro.getUltimoChequeo() + ", Dieta: " + loro.getDieta() + ", Cuidados Especiales: " + loro.isCuidadosEspeciales() + ", Vacunado: " + loro.isVacunado() + ", Energía: " + loro.getEnergia() + ", Comportamiento: " + loro.getComportamiento() + ", Edad: " + loro.getEdad() + " años");
                break;
            case 8:
                System.out.println("Nombre: " + colibri.getNombre() + ", Habilidad Especial: " + colibri.getHabilidadEspecial() + ", Vive en: " + colibri.getTipoHabitat() + ", Estado de Salud: " + colibri.getEstadoSalud() + ", Último chequeo: " + colibri.getUltimoChequeo() + ", Dieta: " + colibri.getDieta() + ", Cuidados Especiales: " + colibri.isCuidadosEspeciales() + ", Vacunado: " + colibri.isVacunado() + ", Energía: " + colibri.getEnergia() + ", Comportamiento: " + colibri.getComportamiento() + ", Edad: " + colibri.getEdad() + " años");
                break;
            case 9:
                System.out.println("Nombre: " + aguila.getNombre() + ", Habilidad Especial: " + aguila.getHabilidadEspecial() + ", Vive en: " + aguila.getTipoHabitat() + ", Estado de Salud: " + aguila.getEstadoSalud() + ", Último chequeo: " + aguila.getUltimoChequeo() + ", Dieta: " + aguila.getDieta() + ", Cuidados Especiales: " + aguila.isCuidadosEspeciales() + ", Vacunado: " + aguila.isVacunado() + ", Energía: " + aguila.getEnergia() + ", Comportamiento: " + aguila.getComportamiento() + ", Edad: " + aguila.getEdad() + " años");
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número entre 1 y 9.");
                break;
        }
    }
}


