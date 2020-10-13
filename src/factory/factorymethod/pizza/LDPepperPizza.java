package factory.factorymethod.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:50
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        super.setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨原材料准备中...");
    }
}
