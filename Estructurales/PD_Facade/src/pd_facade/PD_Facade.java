package pd_facade;

import java.util.*;

public class PD_Facade {

    public static void main(String[] args) {
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));
        List<String> resultados = webServiceAuto.buscaVehiculos(6000, 1000);
        if (resultados.size() > 0) {
            System.out.println("Vehiculo(s) cuyo precio esta comprendido " + "entre 5000 y 7000");
            for (String resultado : resultados) {
                System.out.println("   " + resultado);
            }
        }
    }

}
