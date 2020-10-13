package factory.simplefactory.pizzastore.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:05
 */
public class ChessPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("为制作奶酪披萨准备原材料...");
    }
}
