package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:37
 */
public class Coffee extends Drink{


    @Override
    public float cost() {
        return super.getPrice();
    }
}
