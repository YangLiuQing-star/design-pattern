package factory.factorymethod.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:50
 */
public class BJChessPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨原材料准备中...");
    }
}
