package pd_interpreter;

public class Command extends Expresion {

    private String command;

    public Command(String command) {
        this.command = command;
    }

    @Override
    public String interpret() {
        return "[" + command + "]";
    }

}
