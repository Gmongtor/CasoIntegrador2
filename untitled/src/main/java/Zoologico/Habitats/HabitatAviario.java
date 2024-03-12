package Zoologico.Habitats;

public class HabitatAviario extends Habitats {

    boolean puede_volar;

    public HabitatAviario(float temperatura,float humedad,boolean limpieza, boolean puede_volar) {
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
    }
    public void MostrarInformacion() {
        System.out.println("Temperatura: " + getTemperatura() + "°C");
        System.out.println("Humedad: " + getHumedad() + "%");
        System.out.println("Limpieza: " + (isLimpieza() ? "Sí" : "No"));
        System.out.println("Puede volar: " + (puede_volar ? "Sí" : "No"));
    }

    public String toString() {
        return "aviario []";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }
}

