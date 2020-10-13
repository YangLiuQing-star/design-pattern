package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:52
 * 具体的装饰者
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");//调味品的描述
        setPrice(2.0f);//调味品的价格
    }
}
