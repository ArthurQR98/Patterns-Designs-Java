package pd_adapter;
public class PD_Adapter {
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHTML();
        documento1.setContenido("Hello everyone");
        documento1.dibuja();
        documento1.imprime();
        System.out.println("-- PDF --");
        documento2 = new DocumentoPDF();
        documento2.setContenido("Hello Peru");
        documento2.dibuja();
        documento2.imprime();
    }
    
}
