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
                    HabitatTerrestre terrestre = new HabitatTerrestre();
                    break;
                case "acuático":
                    HabitatAcuatico acuatico = new HabitatAcuatico();
                    break;
                case "aviario":
                    HabitatAviario aviario = new HabitatAviario();
                    break;
                default:
                    System.out.println("Hábitat no reconocido.");
                    break;
            }
        } else if ("administrador".equals(rol)) {
            System.out.println("¿Qué gestión te gustaría realizar? (Recursos, Mantenimiento, Pedidos)");
            String gestionSeleccionada = scanner.nextLine().trim().toLowerCase();

            switch (gestionSeleccionada) {
                case "recursos":
                    AdministracionRecursos adminRecursos = new AdministracionRecursos();
                    break;
                case "mantenimiento":
                    GestorMantenimiento gestorMantenimiento = new GestorMantenimiento();
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
