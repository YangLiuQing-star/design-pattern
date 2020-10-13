package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 18:01
 */
public class WildDuck extends Duck {

    /**
     * 构造器初始化
     */
    public WildDuck() {
        System.out.println("我是野鸭");
        flyBehavior = new GoodFlyBehavior();
        quakeBehavior = new GaGaQuakeBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是野鸭...");
    }
}
