package Zoologico.Habitats;

public class HabitatAviario extends Habitats {

    boolean puedeVolar;

    public HabitatAviario(float temperatura, float humedad, boolean limpieza, boolean puedeVolar) {
        super(temperatura, humedad, limpieza);
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "HabitatAviario{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", limpieza=" + limpieza +
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
        return super.equals(obj) && puedeVolar == that.puedeVolar;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (puedeVolar ? 1 : 0);
        return result;
    }

}



