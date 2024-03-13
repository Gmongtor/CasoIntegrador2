package Zoologico.Animales;

public abstract class Animales {
    protected String nombre;
    protected int edad;
    protected String estadoSalud;
    protected String comportamiento;
    protected boolean vacunado;
    protected int energia;
    protected String dieta;
    protected boolean cuidadosEspeciales;
    protected String ultimoChequeo;

    public Animales(String nombre, int edad, String estadoSalud, String comportamiento, int energia, boolean vacunado, String dieta, boolean cuidadosEspeciales, String ultimoChequeo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.comportamiento = comportamiento;
        this.vacunado = vacunado;
        this.energia = energia;
        this.dieta = dieta;
        this.cuidadosEspeciales = cuidadosEspeciales;
        this.ultimoChequeo = ultimoChequeo;
    }

    // Método abstracto para que las clases hijas implementen el sonido específico
    public abstract void sonidoEspecifico();

    // Métodos para alimentar y registrar la salud y el comportamiento
    public void alimentar(String comida) {
        System.out.println(nombre + " ha sido alimentado con " + comida + ".");
    }

    public void registrarSalud(String estado) {
        this.estadoSalud = estado;
        System.out.println("El estado de salud de " + nombre + " es ahora: " + estado + ".");
    }

    public void registrarComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
        System.out.println("El comportamiento de " + nombre + " es ahora: " + comportamiento + ".");
    }

    // Métodos getters y setters para los nuevos campos
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public boolean isCuidadosEspeciales() {
        return cuidadosEspeciales;
    }

    public void setCuidadosEspeciales(boolean cuidadosEspeciales) {
        this.cuidadosEspeciales = cuidadosEspeciales;
    }

    public String getUltimoChequeo() {
        return ultimoChequeo;
    }

    public void setUltimoChequeo(String ultimoChequeo) {
        this.ultimoChequeo = ultimoChequeo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public String getComportamiento() {
        return comportamiento;
    }
}

