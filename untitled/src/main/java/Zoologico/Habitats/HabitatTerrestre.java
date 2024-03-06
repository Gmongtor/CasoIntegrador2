package Zoologico.Habitats;

public class HabitatTerrestre extends Habitats {
    private double calidadDelSuelo;

    public HabitatTerrestre(String nombre, double calidadDelSuelo) {
        super(nombre);
        this.calidadDelSuelo = calidadDelSuelo;
    }

    @Override
    public void monitorearCondiciones() {

        double temperaturaObtenida = obtenerTemperatura();
        double humedadObtenida = obtenerHumedad();
        boolean estadoDeLimpieza = verificarLimpieza();


        double calidadSueloObtenida = obtenerCalidadDelSuelo();


        actualizarCondiciones(temperaturaObtenida, humedadObtenida, estadoDeLimpieza);
        this.calidadDelSuelo = calidadSueloObtenida;

        System.out.println("Condiciones del hábitat terrestre '" + nombre + "' monitoreadas: temperatura = " + temperaturaObtenida +
                ", humedad = " + humedadObtenida + ", limpio = " + estadoDeLimpieza +
                ", calidad del suelo = " + calidadSueloObtenida);
    }

    private double obtenerTemperatura() {

        return 24.0;
    }

    private double obtenerHumedad() {

        return 50.0;
    }

    private boolean verificarLimpieza() {

        return true;
    }

    private double obtenerCalidadDelSuelo() {

        return 7.5;
    }

    public double getCalidadDelSuelo() {
        return calidadDelSuelo;
    }

    public void setCalidadDelSuelo(double calidadDelSuelo) {
        this.calidadDelSuelo = calidadDelSuelo;
    }
}
