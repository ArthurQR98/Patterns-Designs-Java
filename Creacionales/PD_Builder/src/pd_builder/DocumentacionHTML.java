package pd_builder;

public class DocumentacionHTML extends Documentacion {

    @Override
    public void agregaDocumento(String documento) {
        if (documento.startsWith("<HTML>")) {
            contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Documento HTML");
        contenido.forEach(s -> {
            System.out.println(s);
        });
    }

}
