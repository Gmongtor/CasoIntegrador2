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
            // El resto del código que solicita el hábitat a visitar permanece igual
            String habitatSeleccionado  = scanner.nextLine().trim().toLowerCase();
            switch (habitatSeleccionado) {
                case "terrestre":
                    new HabitatTerrestre().monitorearCondiciones();
                    break;
                case "acuático":
                    new HabitatAcuatico().mostrarInformacion();
                    break;
                case "aviario":
                    new HabitatAviario().mostrarInformacion();
                    break;
                default:
                    System.out.println("Hábitat no reconocido.");
                    break;
            }
        } else if ("administrador".equals(rol)) {
            // El resto del código que solicita la gestión deseada permanece igual
            String gestionSeleccionada  = scanner.nextLine().trim().toLowerCase();
            switch (gestionSeleccionada) {
                case "recursos":
                    new AdministracionRecursos().gestionarRecursos();
                    break;
                case "mantenimiento":
                    new GestorMantenimiento().gestionarMantenimiento();
                    break;
                // Las implementaciones para "pedidos" y otras gestiones específicas deben seguir un enfoque similar
                default:
                    System.out.println("Opción de gestión no reconocida.");
                    break;
            }
        } else {
            System.out.println("Rol no reconocido. Por favor, indica si eres 'visitante' o 'administrador'.");
        }
    }
}