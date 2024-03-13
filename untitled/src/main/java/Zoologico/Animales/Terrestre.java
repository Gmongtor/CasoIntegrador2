package Zoologico.Animales;

public class Terrestre extends Animales {
    private String tipoHabitat; // Ejemplo: "Bosque", "Desierto"
    private String habilidadEspecial; // Ejemplo: "Correr rápido", "Escalada superior"

    public Terrestre(String nombre, int edad, String estadoSalud, String tipoHabitat, String habilidadEspecial, String comportamiento, int energia, boolean vacunado, String dieta, boolean cuidadosEspeciales, String ultimoChequeo){
        super(nombre, edad, estadoSalud, comportamiento, energia, vacunado, dieta, cuidadosEspeciales, ultimoChequeo);
        this.tipoHabitat = tipoHabitat;
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void sonidoEspecifico() {
        System.out.println(nombre + " emite un sonido característico de su especie terrestre.");
    }

    public void mover() {
        System.out.println(nombre + " se está moviendo, demostrando su habilidad especial de " + habilidadEspecial + ".");
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }
}


