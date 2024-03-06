package Zoologico.Habitats;

    public abstract class Habitats {
        protected String nombre;
        protected double temperatura;
        protected double humedad;
        protected boolean estaLimpio;

        public Habitats(String nombre) {
            this.nombre = nombre;
            this.temperatura = 0.0;
            this.humedad = 0.0;
            this.estaLimpio = true;
        }

        public abstract void monitorearCondiciones();

        protected void actualizarCondiciones(double temperatura, double humedad, boolean estaLimpio) {
            this.temperatura = temperatura;
            this.humedad = humedad;
            this.estaLimpio = estaLimpio;
            System.out.println("Actualizando condiciones para " + nombre);
        }
}
