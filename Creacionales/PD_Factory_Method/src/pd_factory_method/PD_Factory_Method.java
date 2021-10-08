package pd_factory_method;
public class PD_Factory_Method {
    public static void main(String[] args) {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(8000.0);
        cliente.nuevoPedido(1000.0);
        cliente = new ClienteCredito(); // tiene restricciones
        cliente.nuevoPedido(3000.0);  
        cliente.nuevoPedido(1200.0);
    }
    
}
