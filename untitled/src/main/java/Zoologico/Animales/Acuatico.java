package Zoologico.Animales;

public class Acuatico extends Animales {
    private String tipoHabitat; // Ejemplo: "Agua Dulce", "Agua Salada"
    private String habilidadEspecial; // Ejemplo: "Nadar profundo", "Saltar fuera del agua"

    // Actualización del constructor para incluir los nuevos campos de Animales
    public Acuatico(String nombre, int edad, String estadoSalud, String comportamiento, String energia, boolean vacunado, String dieta, boolean cuidadosEspeciales, String ultimoChequeo, String tipoHabitat, String habilidadEspecial) {
        super(nombre, edad, estadoSalud, comportamiento, Integer.parseInt(energia), vacunado, dieta, cuidadosEspeciales, ultimoChequeo);
        this.tipoHabitat = tipoHabitat;
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " emite sonidos bajo el agua.");
    }

    public void nadar() {
        System.out.println(nombre + " está nadando, demostrando su habilidad especial de " + habilidadEspecial + ".");
    }

    // Implementación de getters adicionales para las propiedades específicas de Acuatico
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




