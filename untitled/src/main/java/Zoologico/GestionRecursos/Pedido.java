package Zoologico.GestionRecursos;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private String proveedor;
    private Map<String, Integer> detallesPedido; // Nombre del recurso y cantidad solicitada

    public Pedido(String proveedor) {
        this.proveedor = proveedor;
        this.detallesPedido = new HashMap<>();
    }

    public void añadirDetallePedido(String nombreRecurso, int cantidad) {
        detallesPedido.put(nombreRecurso, cantidad);
    }

    // Getters y setters
    public String getProveedor() {
        return proveedor;
    }

    // Otros métodos para manejar el pedido
}
