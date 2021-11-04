package pd_proxy;

public class Video implements Animacion {

    @Override
    public void dibuja() {
        System.out.println("Mostrar video");
    }

    @Override
    public void click() {
    }

    public void carga(){
        System.out.println("Carga el video");
    }
    
    public void reproduce(){
        System.out.println("Reproducir el video");
    }
}
