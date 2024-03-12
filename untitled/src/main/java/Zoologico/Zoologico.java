package Zoologico;

import java.util.Scanner;
import Zoologico.Habitats.HabitatAcuatico;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatTerrestre;
import Zoologico.Habitats.Habitats;

public class Zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Zoológico. ¿Qué hábitat te gustaría visitar?");
        System.out.println("1. Terrestre");
        System.out.println("2. Acuático");
        System.out.println("3. Aviario");
        System.out.print("Elige una opción (1-3): ");

        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir el resto de la línea para evitar errores de entrada en futuras lecturas

        // Considerando la posibilidad de expandir la funcionalidad, utilizaríamos un enfoque polimórfico:
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

        // Asumiendo que cada clase de hábitat tiene implementado un método mostrarInformacion():
        if (habitatSeleccionado != null) {
            habitatSeleccionado.mostrarInformacion();
        } else {
            System.out.println("Ha ocurrido un error al seleccionar el hábitat.");
        }
    }
}


