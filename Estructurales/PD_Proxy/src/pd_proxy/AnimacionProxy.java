package pd_proxy;

public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "mostrar foto";

    @Override
    public void dibuja() {
        if (video != null) {
            video.dibuja();
        } else {
            dibuja(foto);
        }
    }

    @Override
    public void click() {
        if (video == null) {
            video = new Video();
            video.carga();
        }
        video.reproduce();
    }

    private void dibuja(String foto) {
        System.out.println(foto);
    }

}
