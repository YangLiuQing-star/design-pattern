package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 18:02
 */
public class PeKingDuck extends Duck {

    /**
     * 构造器，初始化
     */
    public PeKingDuck() {
        System.out.println("我是北京鸭");
        flyBehavior = new BadFlyBehavior();
        quakeBehavior = new GeGeQuakeBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是北京鸭...");
    }

}
