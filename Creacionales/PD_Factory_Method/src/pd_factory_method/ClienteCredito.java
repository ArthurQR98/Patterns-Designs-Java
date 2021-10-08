package pd_factory_method;
public class ClienteCredito extends Cliente {

    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
    
}
