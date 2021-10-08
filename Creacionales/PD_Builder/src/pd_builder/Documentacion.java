package pd_builder;

import java.util.*;

public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<>();
    public abstract void agregaDocumento(String documento);
    public abstract void imprime();
}
