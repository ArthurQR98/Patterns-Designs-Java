package pd_bridge;

public class FormularioMatriculacionEspa├▒a extends FormularioMatriculacion {

    public FormularioMatriculacionEspa├▒a(FormularioImpl implementacion) {
        super(implementacion);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }

}
