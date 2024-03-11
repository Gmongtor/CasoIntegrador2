package Zoologico.Habitats;


public class HabitatAcuatico extends Habitats{

    boolean puede_nadar;

    public HabitatAcuatico(float temperatura,float humedad,boolean limpieza,boolean puede_nadar) {
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }


    @Override
    public String toString() {
        return "acuaticos []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    public boolean isPuede_nadar() {
        return puede_nadar;
    }


    public void setPuede_nadar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }

}



