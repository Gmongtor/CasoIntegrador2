package Zoologico.Habitats;

public class HabitatAviario extends Habitats {

    private boolean puedeVolar; // Siguiendo la convención camelCase para nombres de variables

    public HabitatAviario(float temperatura, float humedad, boolean limpieza, boolean puedeVolar) {
        super(temperatura, humedad, limpieza);
        this.puedeVolar = puedeVolar;
    }

    // Ajustando el nombre del método para seguir la convención camelCase
    public void mostrarInformacion() {
        System.out.println("Explorando el hábitat Aviario:");
        System.out.println("Temperatura: " + getTemperatura() + "°C");
        System.out.println("Humedad: " + getHumedad() + "%");
        System.out.println("Limpieza: " + (isLimpieza() ? "Sí" : "No"));
        System.out.println("Puede volar: " + (puedeVolar ? "Sí" : "No"));
    }

    @Override
    public String toString() {
        return "HabitatAviario{" +
                "temperatura=" + getTemperatura() +
                ", humedad=" + getHumedad() +
                ", limpieza=" + isLimpieza() +
                ", puedeVolar=" + puedeVolar +
                '}';
    }

    @Override
    protected HabitatAviario clone() throws CloneNotSupportedException {
        return (HabitatAviario) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HabitatAviario)) return false;
        HabitatAviario that = (HabitatAviario) obj;
        return Float.compare(that.getTemperatura(), getTemperatura()) == 0 &&
                Float.compare(that.getHumedad(), getHumedad()) == 0 &&
                isLimpieza() == that.isLimpieza() &&
                puedeVolar == that.puedeVolar;
    }

    @Override
    public int hashCode() {
        int result = Float.hashCode(getTemperatura());
        result = 31 * result + Float.hashCode(getHumedad());
        result = 31 * result + Boolean.hashCode(isLimpieza());
        result = 31 * result + Boolean.hashCode(puedeVolar);
        return result;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}


