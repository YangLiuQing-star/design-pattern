package factory.absfactory.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:50
 */
public class LDChessPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨原材料准备中...");
    }
}
