package pd_builder;

public class DocumentacionPDF extends Documentacion {

    @Override
    public void agregaDocumento(String documento) {
        if (documento.startsWith("<PDF>")) {
            contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Documento PDF");
        contenido.forEach(s -> {
            System.out.println(s);
        });
    }
}
