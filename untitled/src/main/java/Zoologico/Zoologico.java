package Zoologico;

import java.util.Scanner;
import Zoologico.SistemaDeMantenimiento.GestorMantenimiento;
import Zoologico.SistemaDeMantenimiento.TareaMantenimiento;
import Zoologico.SistemaDeMantenimiento.Camara;
import Zoologico.SistemaDeMantenimiento.SistemaSeguridad;
import Zoologico.SistemaDeMantenimiento.DispositivoSeguridad;

import Zoologico.Habitats.HabitatAcuatico;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatTerrestre;

import Zoologico.GestionRecursos.AdministracionRecursos;
import Zoologico.GestionRecursos.Pedido;
import Zoologico.GestionRecursos.Recurso;

import java.util.Scanner;
import Zoologico.Habitats.HabitatTerrestre;
import Zoologico.Habitats.HabitatAviario;
import Zoologico.Habitats.HabitatAcuatico;

public class Zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Zoológico. ¿Qué hábitat te gustaría visitar?");
        System.out.println("1. Terrestre");
        System.out.println("2. Acuático");
        System.out.println("3. Aviario");
        System.out.print("Elige una opción (1-3): ");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                new HabitatTerrestre(20, 50, true, true);
                break;
            case 2:
                new HabitatAcuatico(25, 70, true, true);
                break;
            case 3:
                new HabitatAviario(25, 60, true, true);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

