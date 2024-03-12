package Zoologico.Habitats;
public class Habitats {
    private float temperatura;
    private float humedad;
    private boolean limpieza;

    public Habitats(float temperatura, float humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return String.format("Habitat [Temperatura: %.1f°C, Humedad: %.1f%%, Limpieza: %s]", temperatura, humedad, limpieza ? "Sí" : "No");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Realizando una copia superficial. Para propiedades complejas, considera una copia profunda.
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Habitats habitats = (Habitats) obj;
        return Float.compare(habitats.temperatura, temperatura) == 0 &&
                Float.compare(habitats.humedad, humedad) == 0 &&
                limpieza == habitats.limpieza;
    }

    @Override
    public int hashCode() {
        int result = Float.hashCode(temperatura);
        result = 31 * result + Float.hashCode(humedad);
        result = 31 * result + Boolean.hashCode(limpieza);
        return result;
    }

    // Getters y Setters
    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public void mostrarHabitat() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + (limpieza ? "Sí" : "No"));
    }

    public void mostrarInformacion() {
    }
}

