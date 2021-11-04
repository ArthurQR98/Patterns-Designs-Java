package pd_mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopupMenu extends Control {

    protected List<String> opciones = new ArrayList<>();
    protected Scanner reader = new Scanner(System.in);

    public PopupMenu(String nombre) {
        super(nombre);
    }

    @Override
    public void informa() {
        System.out.println("Informacion de: " + nombre);
        System.out.println("Valor actual: " + getValor());
        for (int indice = 0; indice < opciones.size(); indice++) {
            System.out.println("- " + indice + " )" + opciones.get(indice));
        }
        int elecciones = reader.nextInt();
        if ((elecciones > 0) && (elecciones < opciones.size())) {
            boolean cambia = !(getValor().equals(opciones.get(elecciones)));
            if (cambia) {
                setValor(opciones.get(elecciones));
                this.modifica();
            }
        }
    }

    public void agregaOpcion(String opcion) {
        opciones.add(opcion);
    }
}
