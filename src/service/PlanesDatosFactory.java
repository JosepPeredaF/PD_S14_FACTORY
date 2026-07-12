package service;

import factory.FabricaCreadora;
import model.PlanDatos;

public class PlanesDatosFactory {
    public static void calculoConsumo(FabricaCreadora fabrica, String proveedor, int numeroMegasConsumidos) {
        System.out.println("BIENVENIDOS A " + proveedor.toUpperCase());
        String[] tipos = {"personal", "negocio", "academico"};
        for (String tipo : tipos) {
            PlanDatos plan = fabrica.crearPlanDatos(tipo);
            float pago = plan.calculoPago(numeroMegasConsumidos);
            System.out.println(plan + " Pago: " + pago + " por " + numeroMegasConsumidos + " megas");
        }
    }
}
