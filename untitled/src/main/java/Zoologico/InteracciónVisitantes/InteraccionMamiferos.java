package Zoologico.InteracciónVisitantes;

// Para amantes de los mamíferos
public class InteraccionMamiferos implements InteraccionVisitante {
    @Override
    public void mostrarInformacion() {
        System.out.println("Conoce a los mamíferos más asombrosos y aprende sobre sus hábitats y comportamientos.");
    }

    @Override
    public void realizarTourPersonalizado(String interes) {
        System.out.println("Un viaje a través de los hábitats de nuestros mamíferos, conociendo sus secretos.");
    }
}
