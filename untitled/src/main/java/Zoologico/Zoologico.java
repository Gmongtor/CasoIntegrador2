package Zoologico;

import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Zoológico. ¿Eres un 'visitante' o un 'administrador'?");

        String rol = scanner.nextLine().trim().toLowerCase();

        if ("visitante".equals(rol)) {
            System.out.println("¿Qué hábitat te gustaría visitar? (Terrestre, Acuático, Aviario)");
            String habitatSeleccionado = scanner.nextLine().trim().toLowerCase();
            switch (habitatSeleccionado) {
                case "terrestre":
                    // Mostrar características del hábitat terrestre y los animales que contiene
                    System.out.println("Visitando hábitat terrestre...");
                    // Aquí iría la lógica para mostrar información específica, por ejemplo:
                    // gestorHabitatTerrestre.mostrarInformacion();
                    break;
                case "acuático":
                    // Mostrar características del hábitat acuático y los animales que contiene
                    System.out.println("Visitando hábitat acuático...");
                    // gestorHabitatAcuatico.mostrarInformacion();
                    break;
                case "aviario":
                    // Mostrar características del aviario y los animales que contiene
                    System.out.println("Visitando aviario...");
                    // gestorAviario.mostrarInformacion();
                    break;
                default:
                    System.out.println("Hábitat no reconocido.");
                    break;
            }
        } else if ("administrador".equals(rol)) {
            // Ofrecer opciones de gestión al administrador
            System.out.println("¿Qué gestión te gustaría realizar? (Recursos, Mantenimiento, Pedidos)");
            String gestionSeleccionada = scanner.nextLine().trim().toLowerCase();
            switch (gestionSeleccionada) {
                case "recursos":
                    // Lógica para gestionar recursos
                    System.out.println("Gestionando recursos...");
                    // gestorRecursos.mostrarMenu();
                    break;
                case "mantenimiento":
                    // Lógica para gestionar mantenimiento
                    System.out.println("Gestionando mantenimiento...");
                    // gestorMantenimiento.mostrarMenu();
                    break;
                case "pedidos":
                    // Lógica para gestionar pedidos
                    System.out.println("Gestionando pedidos...");
                    // gestorPedidos.mostrarMenu();
                    break;
                default:
                    System.out.println("Opción de gestión no reconocida.");
                    break;
            }
        } else {
            System.out.println("Rol no reconocido. Por favor, indica si eres 'visitante' o 'administrador'.");
        }
    }
}
