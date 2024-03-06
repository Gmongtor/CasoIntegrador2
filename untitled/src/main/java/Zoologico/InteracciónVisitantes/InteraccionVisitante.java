package Zoologico.InteracciónVisitantes;

public interface InteraccionVisitante {
    void mostrarInformacion();
    void realizarTourPersonalizado(String interes);
}

public class QuioscoInteractivo {
    private InteraccionVisitante interaccion;

    public void seleccionarInteraccion(String interes) {
        switch (interes) {
            case "niños":
                interaccion = new InteraccionNinos();
                break;
            case "aves":
                interaccion = new InteraccionAves();
                break;
            case "mamíferos":
                interaccion = new InteraccionMamiferos();
                break;
            default:
                System.out.println("Selección no válida, mostrando información general.");
                interaccion = null;
        }
    }

    public void mostrarInformacion() {
        if (interaccion != null) {
            interaccion.mostrarInformacion();
        } else {
            System.out.println("Bienvenido al zoológico! Explora y aprende sobre todos nuestros animales.");
        }
    }

    public void realizarTour(String interes) {
        if (interaccion != null) {
            interaccion.realizarTourPersonalizado(interes);
        } else {
            System.out.println("Disfruta de un tour general por nuestro zoológico.");
        }
    }
}
