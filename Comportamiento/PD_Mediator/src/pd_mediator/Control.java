package pd_mediator;

abstract public class Control {
    protected String valor = "";
    public Formulario director;
    public String nombre;

    public Control(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Formulario getDirector() {
        return director;
    }

    public void setDirector(Formulario director) {
        this.director = director;
    }
    
    public abstract void informa();
    
    protected void modifica(){
        getDirector().controlModificado(this);
    }
}
