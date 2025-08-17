public class PedidoEspaña extends Pedido {
    @Override
    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.21;
    }
}