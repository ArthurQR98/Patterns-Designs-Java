package pd_builder;
public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo{

    public ConstructorDocumentacionVehiculoPDF() {
        documentacion = new DocumentacionPDF();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolitante) {
        String documento;
        documento = "<PDF>Solicitud de matricula Solicitante: " + nombreSolitante + "</PDF>";
        documentacion.agregaDocumento(documento);
    }
    
}
