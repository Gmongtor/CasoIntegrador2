package Zoologico.GestionRecursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedidos {
    private List<String> listaPedidos;

    public Pedidos() {
        this.listaPedidos = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        listaPedidos.add(producto);
        System.out.println(producto + " ha sido agregado a la lista de pedidos.");
    }

    public void eliminarProducto(String producto) {
        if (listaPedidos.remove(producto)) {
            System.out.println(producto + " ha sido eliminado de la lista de pedidos.");
        } else {
            System.out.println("El producto no se encontraba en la lista de pedidos.");
        }
    }

    public void mostrarPedidos() {
        if (listaPedidos.isEmpty()) {
            System.out.println("La lista de pedidos está vacía.");
        } else {
            System.out.println("Lista de Pedidos:");
            listaPedidos.forEach(System.out::println);
        }
    }

    public static void gestionarPedidos() {
        Pedidos pedidos = new Pedidos();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n¿Desea 'agregar', 'eliminar' un producto o 'mostrar' la lista de pedidos? (escriba 'salir' para finalizar)");
            opcion = scanner.nextLine().trim().toLowerCase();

            switch (opcion) {
                case "agregar":
                    System.out.print("Ingrese el nombre del producto a agregar: ");
                    String productoAgregar = scanner.nextLine().trim();
                    pedidos.agregarProducto(productoAgregar);
                    break;
                case "eliminar":
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String productoEliminar = scanner.nextLine().trim();
                    pedidos.eliminarProducto(productoEliminar);
                    break;
                case "mostrar":
                    pedidos.mostrarPedidos();
                    break;
                case "salir":
                    System.out.println("Finalizando gestión de pedidos.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("salir"));
    }
}

