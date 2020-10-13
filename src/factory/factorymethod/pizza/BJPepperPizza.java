package factory.factorymethod.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:50
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨原材料准备中...");
    }
}
