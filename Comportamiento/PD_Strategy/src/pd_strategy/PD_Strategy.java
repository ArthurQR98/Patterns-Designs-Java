package pd_strategy;

public class PD_Strategy {
    public static void main(String[] args) {
        VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new DibujaTresVehiculosPorLinea());
        vistaCatalogo1.dibuja();
        VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new DibujaUnVehiculoPorLinea());
        vistaCatalogo2.dibuja();
    }
}