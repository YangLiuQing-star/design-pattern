package strategy.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/12 17:56
 * 策略模式
 * 多用组合或者聚合，少用继承
 */
public abstract class Duck {

    public Duck(){}

    public void quack(){
        System.out.println("鸭子会嘎嘎叫~~~");
    }

    public void swim(){
        System.out.println("鸭子会游泳...");
    }

    public void fly(){
        System.out.println("鸭子会飞翔...");
    }

    //显示鸭子
    public abstract void display();
}
