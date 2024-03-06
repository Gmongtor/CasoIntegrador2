package Zoologico.GestionRecursos;

import java.util.HashMap;
import java.util.Map;

public class AdministracionRecursos {
    private Map<String, Recurso> inventarioAlimentos = new HashMap<>();
    private Map<String, Recurso> inventarioMedicinas = new HashMap<>();
    private Map<String, Recurso> inventarioEquipamiento = new HashMap<>();

    // Método para añadir recursos al inventario
    public void añadirRecurso(String tipo, Recurso recurso) {
        switch (tipo) {
            case "alimento":
                inventarioAlimentos.put(recurso.getNombre(), recurso);
                break;
            case "medicina":
                inventarioMedicinas.put(recurso.getNombre(), recurso);
                break;
            case "equipamiento":
                inventarioEquipamiento.put(recurso.getNombre(), recurso);
                break;
            default:
                System.out.println("Tipo de recurso no reconocido.");
        }
    }

    // Métodos para consultar el inventario
    public void mostrarInventario(String tipo) {
        Map<String, Recurso> inventario = null;
        switch (tipo) {
            case "alimento":
                inventario = inventarioAlimentos;
                break;
            case "medicina":
                inventario = inventarioMedicinas;
                break;
            case "equipamiento":
                inventario = inventarioEquipamiento;
                break;
            default:
                System.out.println("Tipo de inventario no reconocido.");
                return;
        }

        if (inventario != null && !inventario.isEmpty()) {
            System.out.println("Inventario de " + tipo + ":");
            inventario.values().forEach(recurso ->
                    System.out.println(recurso.getNombre() + ", Cantidad: " + recurso.getCantidad()));
        } else {
            System.out.println("El inventario de " + tipo + " está vacío.");
        }
    }
}
