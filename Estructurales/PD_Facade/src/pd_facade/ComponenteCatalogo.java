package pd_facade;

import java.util.ArrayList;
import java.util.List;

public class ComponenteCatalogo implements Catalogo {

    protected Object[] descriptionVehiculo = {
        "Berlina 5 puertas", 6000,
        "Compacto 3 puertas", 4000,
        "Espace 5 puertas", 8000,
        "Break 5 puertas", 7000,
        "Coupé 2 puertas", 9000,
        "Utilitario 3 puertas", 5000
    };

    @Override
    public List<String> buscaVehiculos(int precioMin, int precioMax) {
        int indice, tamaño;
        List<String> resultado = new ArrayList<>();
        tamaño = descriptionVehiculo.length / 2;
        for (indice = 0; indice < tamaño; indice++) {
            int precio = (Integer) descriptionVehiculo[2 * indice + 1];
            if ((precio >= precioMin) && (precio <= precioMax)) {
                resultado.add((String) descriptionVehiculo[2 * indice]);
            }
        }
        return resultado;
    }

}
