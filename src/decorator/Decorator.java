package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:42
 * 装饰者
 */
public class Decorator extends Drink{

    //组合饮料
    private Drink drink;

    //组合
    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        //调味品的价格+咖啡的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() +"("+super.getPrice() + ")&&"+ this.drink.getDescription()+"("+drink.cost() +")";
    }
}
