package Zoologico.Habitats;

public class HabitatTerrestre extends Habitats {

    boolean puedeCaminar;

    public HabitatTerrestre(float temperatura, float humedad, boolean limpieza, boolean puedeCaminar) {
        super(temperatura, humedad, limpieza);
        this.puedeCaminar = puedeCaminar;
    }


    @Override
    public String toString() {
        return "HabitatTerrestre{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", limpieza=" + limpieza +
                ", puedeCaminar=" + puedeCaminar +
                '}';
    }

    @Override
    protected HabitatTerrestre clone() throws CloneNotSupportedException {
        return (HabitatTerrestre) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HabitatTerrestre)) return false;
        HabitatTerrestre that = (HabitatTerrestre) obj;
        return super.equals(obj) && puedeCaminar == that.puedeCaminar;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (puedeCaminar ? 1 : 0);
        return result;
    }

    public boolean isPuedeCaminar() {
        return puedeCaminar;
    }

    public void setPuedeCaminar(boolean puedeCaminar) {
        this.puedeCaminar = puedeCaminar;
    }
}

