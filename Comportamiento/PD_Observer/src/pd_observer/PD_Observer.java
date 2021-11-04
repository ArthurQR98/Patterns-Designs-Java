package pd_observer;

public class PD_Observer {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo.setDescripcion("Vehiculo economico");
        vehiculo2.setDescripcion("Vehiculo moderno futurista");
        vehiculo.setPrecio(5000.0);
        vehiculo2.setPrecio(25000.0);
        VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
        VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo2);
        vistaVehiculo.redibuja();
        vistaVehiculo2.redibuja();
        vehiculo.setPrecio(4500.0);
        vehiculo2.setPrecio(34500.0);
//        VistaVehiculo vistaVehiculo3 = new VistaVehiculo(vehiculo2);
        vehiculo2.setPrecio(25000.0);
        vehiculo.setPrecio(5500.0);
    }

}
