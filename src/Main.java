import factory.FabricaClaro;
import factory.FabricaLineaRapida;
import factory.FabricaMovistar;
import service.PlanesDatosFactory;

public class Main {
    static void main() {
        PlanesDatosFactory.calculoConsumo(new FabricaLineaRapida(), "Linea Rapida", 1000);
        System.out.println();
        PlanesDatosFactory.calculoConsumo(new FabricaClaro(), "Claro", 1000);
        System.out.println();
        PlanesDatosFactory.calculoConsumo(new FabricaMovistar(), "Movistar", 1000);
    }

}

