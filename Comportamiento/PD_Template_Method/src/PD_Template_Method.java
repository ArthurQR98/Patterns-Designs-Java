public class PD_Template_Method {
    public static void main(String[] args) {
        Pedido pedidoEspaña = new PedidoEspaña();
        pedidoEspaña.setImporteSinIVA(1000);
        pedidoEspaña.calculaPrecioConIVA();
        pedidoEspaña.visualiza();

        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIVA(1000);
        pedidoLuxemburgo.calculaPrecioConIVA();
        pedidoLuxemburgo.visualiza();
    }
}