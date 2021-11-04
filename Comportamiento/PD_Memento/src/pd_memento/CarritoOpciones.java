
package pd_memento;

import java.util.ArrayList;
import java.util.List;

public class CarritoOpciones {
    
    protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();
    
    public Memento agregaOpcion(OpcionVehiculo opcionVehiculo){
        MementoImpl resultado = new MementoImpl();
        resultado.setEstado(opciones);
        opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());
        opciones.add(opcionVehiculo);
        return resultado;
    }
    
    public void anula(Memento memento){
        MementoImpl mementoImplInstance;
        try {
            mementoImplInstance = (MementoImpl)memento;
        } catch (ClassCastException e) {
            return;
        }
        opciones = mementoImplInstance.getEstado();
    }
    
    public void visualiza(){
        System.out.println("Contenido del carrito de opciones");
        opciones.forEach(opcion -> {
            opcion.visualiza();
        });
        System.out.println();
    }
}
