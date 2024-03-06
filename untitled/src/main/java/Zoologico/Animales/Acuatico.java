package Zoologico.Animales;

public class Acuatico extends Animales {
    private String tipoHabitat; // Ejemplo: "Agua Dulce", "Agua Salada"
    private String habilidadEspecial; // Ejemplo: "Nadar profundo", "Saltar fuera del agua"

    public Acuatico(String nombre, int edad, String estadoSalud, String tipoHabitat, String habilidadEspecial) {
        super(nombre, edad, estadoSalud);
        this.tipoHabitat = tipoHabitat;
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " emite sonidos bajo el agua.");
    }

    public void nadar() {
        System.out.println(nombre + " está nadando, mostrando su habilidad: " + habilidadEspecial + ".");
    }

    // Implementación de métodos para registrar la alimentación, salud y comportamiento específicos de acuáticos.
    @Override
    public void alimentar(String comida) {
        super.alimentar(comida);
        // Añadir condiciones o comportamientos específicos de alimentación de acuáticos aquí.
        System.out.println(nombre + " atrapa y come su comida en el agua: " + comida + ".");
    }

    // Métodos getters y setters para tipoHabitat y habilidadEspecial aquí
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
}
