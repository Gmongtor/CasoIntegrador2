package Zoologico.Animales;
import java.util.List;
import java.util.Scanner;

public class MantenimientoAnimales {

    private List<Animales> animales;

    public MantenimientoAnimales(List<Animales> animales) {
        this.animales = animales;
    }

    public void mostrarInformacionDetallada() {
        for (Animales animal : animales) {
            System.out.println("--------------------------------------------------");
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Edad: " + animal.getEdad() + " años");
            System.out.println("Estado de salud: " + animal.getEstadoSalud());
            System.out.println("Comportamiento: " + animal.getComportamiento());
            System.out.println("Energía: " + animal.getEnergia());
            System.out.println("Vacunado: " + (animal.isVacunado() ? "Sí" : "No"));
            System.out.println("Dieta: " + animal.getDieta());
            System.out.println("Cuidados Especiales: " + (animal.isCuidadosEspeciales() ? "Sí" : "No"));
            System.out.println("Último chequeo: " + animal.getUltimoChequeo());
            animal.sonidoEspecifico();
            System.out.println("--------------------------------------------------");
        }
    }

    public void seleccionarAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un animal para mostrar su información detallada:");
        for (int i = 0; i < animales.size(); i++) {
            System.out.println((i + 1) + ". " + animales.get(i).getNombre());
        }
        int eleccion = scanner.nextInt() - 1;
        scanner.close();
        if (eleccion >= 0 && eleccion < animales.size()) {
            mostrarInformacionDetallada(animales.get(eleccion));
        } else {
            System.out.println("Selección inválida.");
        }
    }

    private void mostrarInformacionDetallada(Animales animal) {
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Estado de salud: " + animal.getEstadoSalud());
        System.out.println("Comportamiento: " + animal.getComportamiento());
        System.out.println("Energía: " + animal.getEnergia());
        System.out.println("Vacunado: " + (animal.isVacunado() ? "Sí" : "No"));
        System.out.println("Dieta: " + animal.getDieta());
        System.out.println("Cuidados Especiales: " + (animal.isCuidadosEspeciales() ? "Sí" : "No"));
        System.out.println("Último chequeo: " + animal.getUltimoChequeo());
        animal.sonidoEspecifico();
        System.out.println("--------------------------------------------------");
    }

}


