package Zoologico.InteracciónVisitantes;

// Para aficionados a las aves
public class InteraccionAves implements InteraccionVisitante {
    @Override
    public void mostrarInformacion() {
        System.out.println("Descubre las aves más increíbles y sus cantos únicos en nuestro aviario.");
    }

    @Override
    public void realizarTourPersonalizado(String interes) {
        System.out.println("Explorando el mundo de las aves: un tour guiado por nuestro aviario.");
    }
}
