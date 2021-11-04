package pd_proxy;
public class PD_Proxy {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.click();
        animacion.dibuja();
    }
    
}
