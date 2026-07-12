package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class    FabricaLineaRapida extends FabricaCreadora {

    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan;
        if (tipo.equals("personal")) {
            plan = new PlanDatosPersonal();
            plan.setTasa(0.5f);
        } else if (tipo.equals("negocio")) {
            plan = new PlanDatosNegocio();
            plan.setTasa(1.5f);
        } else if (tipo.equals("academico")) {
            plan = new PlanDatosAcademico();
            plan.setTasa(1.0f);
        } else {
            throw new IllegalArgumentException("Tipo de plan no valido: " + tipo);
        }
        return plan;
    }
}
