package pd_prototype;

import java.util.ArrayList;

public class DocumentacionEnBlanco extends Documentacion {

    private static DocumentacionEnBlanco _instance = null;

    public DocumentacionEnBlanco() {
        documentos = new ArrayList<>();
    }

    public static DocumentacionEnBlanco Instance() {
        if (_instance == null) {
            _instance = new DocumentacionEnBlanco();
        }
        return _instance;
    }
    
    public void incluye(Documento doc){
        documentos.add(doc);
    }
    
    public void excluye(Documento doc){
        documentos.remove(doc);
    }
}
