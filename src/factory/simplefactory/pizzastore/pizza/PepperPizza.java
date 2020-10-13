package factory.simplefactory.pizzastore.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:29
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料...");
    }
}
