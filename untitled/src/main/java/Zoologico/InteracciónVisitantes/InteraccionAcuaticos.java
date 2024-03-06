package Zoologico.InteracciónVisitantes;

// Para niños
public class InteraccionAcuaticos implements InteraccionVisitante {
    @Override
    public void mostrarInformacion() {
        System.out.println("Bienvenidos niños! Aquí aprenderemos sobre los animales de forma divertida.");
    }

    @Override
    public void realizarTourPersonalizado(String interes) {
        System.out.println("Un tour especial para descubrir animales fascinantes y aprender jugando.");
    }
}
