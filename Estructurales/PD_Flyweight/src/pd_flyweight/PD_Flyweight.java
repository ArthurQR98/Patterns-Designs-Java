package pd_flyweight;

public class PD_Flyweight {

    public static void main(String[] args) {
        FabricaOpcion fabrica = new FabricaOpcion();
        VehiculoSolicitado vehiculo = new VehiculoSolicitado();
        vehiculo.AgregaOpciones("air bag", 80, fabrica);
        vehiculo.AgregaOpciones("direccion asistida", 90, fabrica);
        vehiculo.AgregaOpciones("elevalunas electricos", 85, fabrica);
        vehiculo.muestraOpciones();
    }

}
