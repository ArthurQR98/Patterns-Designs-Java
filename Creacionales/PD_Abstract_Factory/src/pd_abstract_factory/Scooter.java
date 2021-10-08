package pd_abstract_factory;
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }
    
    public abstract void mostrarCaracteristicas();
}
