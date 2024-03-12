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
        // Ejemplo genérico, puedes especificar diferentes sonidos para diferentes tipos de animales acuáticos si lo prefieres
        System.out.println(nombre + " emite sonidos bajo el agua.");
    }

    public void nadar() {
        // Utilizando habilidadEspecial para describir cómo nada el animal
        System.out.println(nombre + " está nadando, demostrando su habilidad especial de " + habilidadEspecial + ".");
    }

    // Getters
    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }
}



