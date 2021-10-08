package pd_builder;
public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHTML() {
        documentacion = new DocumentacionHTML();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
        documentacion.agregaDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolitante) {
        String documento;
        documento = "<HTML>Solicitud de matriculacion solicitante: " + nombreSolitante + "</HTML>";
        documentacion.agregaDocumento(documento);
    }
    
}
