package pd_abstract_factory;
public class FabricaVehiculoGasolina implements FabricaVehiculo{

    @Override
    public Automovil createAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo,color,potencia,espacio);
    }

    @Override
    public Scooter createScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo,color,potencia);
    }
    
}
