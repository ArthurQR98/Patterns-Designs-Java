package pd_flyweight;

import java.util.ArrayList;
import java.util.List;

public class VehiculoSolicitado {

    protected List<OpcionVehiculo> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<>();

    public void AgregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica) {
        opciones.add(fabrica.getOption(nombre));
        precioDeVentaOpciones.add(precioDeVenta);
    }

    public void muestraOpciones() {
        int indice, tamaño;
        tamaño = opciones.size();
        for (indice = 0; indice < tamaño; indice++) {
            opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
            System.out.println();
        }
    }
}
