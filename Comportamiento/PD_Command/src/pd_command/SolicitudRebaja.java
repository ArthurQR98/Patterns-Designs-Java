package pd_command;

import java.util.ArrayList;
import java.util.List;

public class SolicitudRebaja {

    protected List<Vehiculo> vehiculosEnStock = new ArrayList<>();
    protected long hoy;
    protected long tiempoEnStock;
    protected double tasaDescuento;

    public SolicitudRebaja(long hoy, long tiempoEnStock, double tasaDescuento) {
        this.hoy = hoy;
        this.tiempoEnStock = tiempoEnStock;
        this.tasaDescuento = tasaDescuento;
    }

    public void rebaja(List<Vehiculo> vehiculos) {
        vehiculosEnStock.clear();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTiempoEnStock(hoy) >= tiempoEnStock) {
                vehiculosEnStock.add(vehiculo);
            }
        }
        vehiculosEnStock.forEach(vehiculo -> {
            vehiculo.modicaPrecio(1.0 - tasaDescuento);
        });
    }

    public void anula() {
        vehiculosEnStock.forEach(vehiculo -> {
            vehiculo.modicaPrecio(1.0 / (1.0 - tasaDescuento));
        });
    }

    public void restablece() {
        vehiculosEnStock.forEach(vehiculo -> {
            vehiculo.modicaPrecio(1.0 - tasaDescuento);
        });
    }
}
