package pd_builder;

public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatriculacion(String nombreSolitante);

    public Documentacion resultado() {
        return documentacion;
    }
}
