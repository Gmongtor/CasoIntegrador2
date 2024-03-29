package Zoologico.Habitats;

public class HabitatAcuatico extends Habitats {

    private boolean puedeNadar;

    public HabitatAcuatico(float temperatura, float humedad, boolean limpieza, boolean puedeNadar) {
        super(temperatura, humedad, limpieza);
        this.puedeNadar = puedeNadar;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Explorando el hábitat Acuático:");
        System.out.println("Temperatura: " + getTemperatura() + "°C");
        System.out.println("Humedad: " + getHumedad() + "%");
        System.out.println("Limpieza: " + (isLimpieza() ? "Sí" : "No"));
        System.out.println("Capacidad para nadar: " + (puedeNadar ? "Sí" : "No"));
    }

    @Override
    public String toString() {
        return "HabitatAcuatico{" +
                "temperatura=" + getTemperatura() +  // Usar getter ya que temperatura es private en la clase base
                ", humedad=" + getHumedad() +  // Usar getter por la misma razón
                ", limpieza=" + isLimpieza() +
                ", puedeNadar=" + puedeNadar +
                '}';
    }

    // Los métodos clone, equals y hashCode son correctos y no necesitan ser modificados en este contexto.

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }
}






