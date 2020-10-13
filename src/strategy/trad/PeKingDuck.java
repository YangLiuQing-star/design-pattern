package strategy.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/12 18:02
 */
public class PeKingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是北京鸭...");
    }

    //因为北京鸭不能飞，所以重写fly方法
    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔");
    }
}
