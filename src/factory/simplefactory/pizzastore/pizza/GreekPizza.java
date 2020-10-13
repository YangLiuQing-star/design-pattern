package factory.simplefactory.pizzastore.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:08
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料...");
    }
}
