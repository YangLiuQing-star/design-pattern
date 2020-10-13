package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 21:33
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
