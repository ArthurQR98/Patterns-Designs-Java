package pd_builder;

import java.util.Scanner;

public class PD_Builder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.println("Desea generar " + "documentacion HTML(1) o PDF(2):");
        String seleccion = reader.next();
        if(seleccion.equals("1"))
            constructor = new ConstructorDocumentacionVehiculoHTML();
        else 
            constructor = new ConstructorDocumentacionVehiculoPDF();
        
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.contruye("Arthur");
        documentacion.imprime();
    }
    
}
