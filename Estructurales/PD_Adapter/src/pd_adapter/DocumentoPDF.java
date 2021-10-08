package pd_adapter;
public class DocumentoPDF implements Documento{
    protected ComponentePDF herramientaPDF = new ComponentePDF(); 
    @Override
    public void setContenido(String contenido) {
        herramientaPDF.pdfFijaContenido(contenido);
    }

    @Override
    public void dibuja() {
        herramientaPDF.pdfPreparaVisualizacion();
        herramientaPDF.pdfRefresca();
        herramientaPDF.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprime() {
        herramientaPDF.pdfEnviaImpresora();
    }
    
}
