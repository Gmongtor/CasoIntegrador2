package Zoologico.Habitats;

public class HabitatAviario extends Habitats {
    private double flujoDeAire;
    private double luzSolar;

    public HabitatAviario(String nombre, double flujoDeAire, double luzSolar) {
        super(nombre);
        this.flujoDeAire = flujoDeAire;
        this.luzSolar = luzSolar;
    }

    @Override
    public void monitorearCondiciones() {


        double temperaturaObtenida = obtenerTemperatura();
        double humedadObtenida = obtenerHumedad();
        boolean estadoDeLimpieza = verificarLimpieza();
        double flujoDeAireObtenido = obtenerFlujoDeAire();
        double luzSolarObtenida = obtenerLuzSolar();


        actualizarCondiciones(temperaturaObtenida, humedadObtenida, estadoDeLimpieza);
        this.flujoDeAire = flujoDeAireObtenido;
        this.luzSolar = luzSolarObtenida;

        System.out.println("Condiciones del hábitat aviario '" + nombre + "' monitoreadas: temperatura = " + temperaturaObtenida +
                ", humedad = " + humedadObtenida + ", limpio = " + estadoDeLimpieza +
                ", flujo de aire = " + flujoDeAireObtenido + ", luz solar = " + luzSolarObtenida);
    }


    private double obtenerTemperatura() {

        return 22.0;
    }

    private double obtenerHumedad() {

        return 60.0;
    }

    private boolean verificarLimpieza() {

        return true;
    }

    private double obtenerFlujoDeAire() {

        return 1.5;
    }

    private double obtenerLuzSolar() {

        return 500;
    }


    public double getFlujoDeAire() {
        return flujoDeAire;
    }

    public void setFlujoDeAire(double flujoDeAire) {
        this.flujoDeAire = flujoDeAire;
    }

    public double getLuzSolar() {
        return luzSolar;
    }

    public void setLuzSolar(double luzSolar) {
        this.luzSolar = luzSolar;
    }
}

