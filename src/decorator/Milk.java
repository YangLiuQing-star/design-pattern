package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:54
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(3.0f);
    }
}
