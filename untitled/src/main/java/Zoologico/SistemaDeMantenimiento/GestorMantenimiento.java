package Zoologico.SistemaDeMantenimiento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorMantenimiento {
    private List<TareaMantenimiento> tareas;

    public GestorMantenimiento() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(TareaMantenimiento tarea) {
        tareas.add(tarea);
    }

    public void completarTarea(String descripcion) {
        tareas.stream()
                .filter(tarea -> tarea.getDescripcion().equals(descripcion) && !tarea.isCompletada())
                .findFirst()
                .ifPresent(TareaMantenimiento::marcarCompletada);
    }

    public void mostrarTareasPendientes() {
        List<TareaMantenimiento> tareasPendientes = tareas.stream()
                .filter(tarea -> !tarea.isCompletada())
                .collect(Collectors.toList());
        System.out.println("Tareas de mantenimiento pendientes:");
        tareasPendientes.forEach(tarea -> System.out.println(tarea.getDescripcion()));
    }
}
