package pd_composite;

public class EmpresaSinFilial extends Empresa {

    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }

    @Override
    public double calculaCosteMantenimiento() {
        return nVehiculos * costeUnitarioVehiculo;
    }

}
