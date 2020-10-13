package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:55
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(1.0f);
    }
}
