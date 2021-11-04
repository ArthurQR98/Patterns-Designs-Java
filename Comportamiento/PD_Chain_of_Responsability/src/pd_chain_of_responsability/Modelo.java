package pd_chain_of_responsability;

public class Modelo extends ObjetoBasico {

    protected String descripcion;
    protected String nombre;

    public Modelo(String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    protected String getDescripcion() {
        if (descripcion != null) {
            return "Modelo " + nombre + " : " + descripcion;
        } else {
            return null;
        }
    }

}
