package pd_composite;
public abstract class Empresa {
    protected static double costeUnitarioVehiculo = 5.0;
    protected int nVehiculos;
    
    public void agregaVehiculo(){
        nVehiculos++;
    }
    
    public abstract double calculaCosteMantenimiento();
    public abstract boolean agregaFilial(Empresa filial);
}
