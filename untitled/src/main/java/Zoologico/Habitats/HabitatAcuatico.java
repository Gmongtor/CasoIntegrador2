package Zoologico.Habitats;

public class HabitatAcuatico extends Habitats {
    private double nivelDeSalinidad;
    private double claridadDelAgua;

    public HabitatAcuatico(String nombre, double nivelDeSalinidad, double claridadDelAgua) {
        super(nombre);
        this.nivelDeSalinidad = nivelDeSalinidad;
        this.claridadDelAgua = claridadDelAgua;
    }

    @Override
    public void monitorearCondiciones() {

        double temperaturaObtenida = obtenerTemperaturaDelAgua();
        double humedadObtenida = obtenerHumedadRelativa();
        boolean estadoDeLimpieza = verificarLimpieza();


        double salinidadObtenida = obtenerNivelDeSalinidad();
        double claridadObtenida = obtenerClaridadDelAgua();


        actualizarCondiciones(temperaturaObtenida, humedadObtenida, estadoDeLimpieza);
        this.nivelDeSalinidad = salinidadObtenida;
        this.claridadDelAgua = claridadObtenida;

        System.out.println("Condiciones del hábitat acuático '" + nombre + "' monitoreadas: temperatura = " + temperaturaObtenida +
                ", humedad = " + humedadObtenida + ", limpio = " + estadoDeLimpieza +
                ", nivel de salinidad = " + salinidadObtenida + ", claridad del agua = " + claridadObtenida);
    }


    private double obtenerTemperaturaDelAgua() {

        return 20.0;
    }

    private double obtenerHumedadRelativa() {

        return 80.0;
    }

    private boolean verificarLimpieza() {

        return true;
    }

    private double obtenerNivelDeSalinidad() {
        return 35.0;
    }

    private double obtenerClaridadDelAgua() {
        return 5.0;
    }

    public double getNivelDeSalinidad() {
        return nivelDeSalinidad;
    }

    public void setNivelDeSalinidad(double nivelDeSalinidad) {
        this.nivelDeSalinidad = nivelDeSalinidad;
    }

    public double getClaridadDelAgua() {
        return claridadDelAgua;
    }

    public void setClaridadDelAgua(double claridadDelAgua) {
        this.claridadDelAgua = claridadDelAgua;
    }
}

