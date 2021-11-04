package pd_interpreter;

import java.util.ArrayList;
import java.util.List;

public class PD_Interpreter {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(new Command("Move"), new Number(5)));
        orders.add(new Order(new Command("Attack"), new Item("enemy")));
        orders.add(new Order(new Command("Defend"), new Item("town")));

        orders.forEach(order -> {
            System.out.println(order.interpret());
        });
    }

}
