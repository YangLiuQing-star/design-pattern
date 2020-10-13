package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 18:03
 */
public class ToyDuck extends Duck {

    public ToyDuck(){
        System.out.println("我是玩具鸭");
        flyBehavior = new NoFlyBehavior();
        quakeBehavior = new NoQuakeBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是玩具鸭...");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

}
