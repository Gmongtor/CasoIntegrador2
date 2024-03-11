package Zoologico.Habitats;

public class HabitatAcuatico extends Habitats {

    boolean puedeNadar;

    public HabitatAcuatico(float temperatura, float humedad, boolean limpieza, boolean puedeNadar) {
        super(temperatura, humedad, limpieza);
        this.puedeNadar = puedeNadar;
    }

    @Override
    public String toString() {
        return "HabitatAcuatico{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", limpieza=" + limpieza +
                ", puedeNadar=" + puedeNadar +
                '}';
    }

    @Override
    protected HabitatAcuatico clone() throws CloneNotSupportedException {
        return (HabitatAcuatico) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HabitatAcuatico)) return false;
        HabitatAcuatico that = (HabitatAcuatico) obj;
        return super.equals(obj) && puedeNadar == that.puedeNadar;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (puedeNadar ? 1 : 0);
        return result;
    }

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }
}




