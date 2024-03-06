package Habitats;

public class HabitatTerrestre extends Habitats {
    private double calidadDelSuelo;

    public HabitatTerrestre(String nombre, double calidadDelSuelo) {
        super(nombre);
        this.calidadDelSuelo = calidadDelSuelo;
    }

    @Override
    public void monitorearCondiciones() {

        actualizarCondiciones(24.0, 50.0, true);
        System.out.println("Monitoreando condiciones terrestres para " + nombre +
                ". Calidad del suelo: " + calidadDelSuelo);
    }

    public double getCalidadDelSuelo() {
        return calidadDelSuelo;
    }

    public void setCalidadDelSuelo(double calidadDelSuelo) {
        this.calidadDelSuelo = calidadDelSuelo;
    }
}
