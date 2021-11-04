package pd_iterator;

public class CatalogoVehiculo extends Catalogo<Vehiculo, IteradorVehiculo> {

    public CatalogoVehiculo() {
        contenido.add(new Vehiculo("vehiculo economico"));
        contenido.add(new Vehiculo("pequeño vehiculo economico"));
        contenido.add(new Vehiculo("vehiculo de gran calidad"));
    }

    @Override
    protected IteradorVehiculo createIterador() {
        return new IteradorVehiculo();
    }

}
