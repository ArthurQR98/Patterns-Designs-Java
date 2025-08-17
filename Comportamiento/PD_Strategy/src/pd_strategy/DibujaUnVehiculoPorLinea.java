package pd_strategy;

import java.util.List;

public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {
    @Override
    public void dibuja(List<VistaVehiculo> contenido) {
        System.out.println("Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vehiculo : contenido) {
            vehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}