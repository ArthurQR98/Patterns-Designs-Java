package pd_interpreter;

public class Number extends Option {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String interpret() {
        return number + "#";
    }

}
