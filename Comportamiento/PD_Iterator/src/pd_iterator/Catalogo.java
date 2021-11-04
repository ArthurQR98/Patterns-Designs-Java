package pd_iterator;

import java.util.ArrayList;
import java.util.List;

abstract public class Catalogo<TElemento extends Elemento, TIterador extends Iterador<TElemento>> {

    protected List<TElemento> contenido = new ArrayList<>();

    protected abstract TIterador createIterador();

    public TIterador busqueda(String palabraClaveConsulta) {
        TIterador resultado = createIterador();
        resultado.setPalabraClaveConsulta(palabraClaveConsulta, contenido);
        return resultado;
    }

    
}
