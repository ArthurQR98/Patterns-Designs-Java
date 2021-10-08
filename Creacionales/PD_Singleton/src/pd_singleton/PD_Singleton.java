package pd_singleton;
public class PD_Singleton {
    public static void main(String[] args) {
        // Inicializacion del comercial en el sistema
        Comercial elComercial = Comercial.Instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com");
        // Muestra el comercial del sistema
        visualiza();
//        elComercial.visualiza();
    }
    public static void visualiza(){
        Comercial elComercial = Comercial.Instance();
        elComercial.visualiza();
    }
    
}
