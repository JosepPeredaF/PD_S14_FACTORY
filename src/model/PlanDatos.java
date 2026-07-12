package model;

public class PlanDatos {

    protected String nombre;
    protected float tasa;

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float calculoPago(int numeroMegasConsumidos) {
        return tasa * numeroMegasConsumidos;
    }

    @Override
    public String toString() {
        return " Plan: " + nombre + " Tasa :" + tasa;
    }
}
