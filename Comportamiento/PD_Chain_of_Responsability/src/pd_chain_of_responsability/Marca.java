package pd_chain_of_responsability;

public class Marca extends ObjetoBasico {

    protected String descripcion1, descripcion2;
    protected String nombre;

    public Marca(String nombre, String descripcion1, String descripcion2) {
        this.nombre = nombre;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
    }

    @Override
    protected String getDescripcion() {
        if ((descripcion1 != null) && (descripcion2 != null)) {
            return "Marca " + nombre + " : " + descripcion1 + " " + descripcion2;
        } else if (descripcion1 != null) {
            return "Marca " + nombre + " : " + descripcion1;
        } else {
            return null;
        }
    }
}
