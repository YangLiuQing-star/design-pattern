package strategy.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/12 18:03
 */
public class ToyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是玩具鸭...");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }
}
