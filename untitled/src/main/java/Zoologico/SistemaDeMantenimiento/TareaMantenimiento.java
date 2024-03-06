package Zoologico.SistemaDeMantenimiento;

public class TareaMantenimiento {
    private String descripcion;
    private String tipo; // Puede ser "Regular" o "Urgente"
    private boolean completada;

    public TareaMantenimiento(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.completada = false;
    }

    public void marcarCompletada() {
        this.completada = true;
        System.out.println("Tarea de mantenimiento completada: " + descripcion);
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isCompletada() {
        return completada;
    }
}
