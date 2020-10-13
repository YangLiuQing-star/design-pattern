package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 21:42
 */
public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        System.out.println("==============================");

        Duck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();

        System.out.println("==============================");

        Duck pkDuck = new PeKingDuck();
        pkDuck.fly();
        pkDuck.quack();

        System.out.println("==============================");

        //动态改变某个对象的行为
        pkDuck.setFlyBehavior(new NoFlyBehavior());
        pkDuck.setQuakeBehavior(new NoQuakeBehavior());
        System.out.println("北京鸭的实际飞翔能力为:");
        pkDuck.fly();
        System.out.println("北京鸭的实际叫的行为:");
        pkDuck.quack();
    }
}
