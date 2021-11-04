
package pd_observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Sujeto {
    protected List<Observador> observadores = new ArrayList<>();
    
    public void agrega(Observador observador) {
        observadores.add(observador);
    }
    
    public void suprime(Observador observador){
        observadores.remove(observador);
    }
    
    public void notifica(){
        observadores.forEach(observador -> {
            observador.actualiza();
        });
    }
}
