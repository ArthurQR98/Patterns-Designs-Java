
package pd_interpreter;

public class Item extends Option{
    private String item;

    public Item(String item) {
        this.item = item;
    }

    @Override
    public String interpret() {
        return item;
    }
   
}
