package pd_abstract_factory;
public interface FabricaVehiculo {
    Automovil createAutomovil(String modelo,String color, int potencia, double espacio);
    Scooter createScooter(String modelo,String color,int potencia);
    
}
