package pd_abstract_factory;

import java.util.Scanner;

public class PD_Abstract_Factory {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scotters = new Scooter[nScooters];
        System.out.println("Desea utilizar " + "vehiculos electricos (1) o a gasolina (2) :");
        String eleccion = reader.next();
        if(eleccion.equals("1"))
            fabrica = new FabricaVehiculoElectricidad();
        else 
            fabrica = new FabricaVehiculoGasolina();
        
        for(int index=0;index < nAutos; index++)
            autos[index] = fabrica.createAutomovil("estandar", "amarillo", 6+index, 3.2);
        for(int index=0;index < nScooters; index++){
            scotters[index] = fabrica.createScooter("clasico", "rojo", 2+index);
        }
        for (Automovil auto:autos)
            auto.mostrarCaracteristicas();
        for (Scooter scooter:scotters)
            scooter.mostrarCaracteristicas();
    }

}
