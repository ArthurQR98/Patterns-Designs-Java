package pd_decorator;

public class PD_Decorator {

    public static void main(String[] args) {
        VistaVehiculo vh = new VistaVehiculo();
        ModeloDecorador md = new ModeloDecorador(vh);
        MarcaDecorador marcaD = new MarcaDecorador(md);
        md.visualiza();
        System.out.println("******************************************");
        marcaD.visualiza();
    }

}
