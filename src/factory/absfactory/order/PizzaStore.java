package factory.absfactory.order;

/**
 * @author YangLiuQing
 * @date 2020/6/6 20:43
 */
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
