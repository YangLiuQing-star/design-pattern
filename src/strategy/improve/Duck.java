package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 17:56
 * 策略模式
 * 多用组合或者聚合，少用继承
 */
public abstract class Duck {

    //聚合策略接口1
    QuakeBehavior quakeBehavior;

    //聚合策略接口2
    FlyBehavior flyBehavior;

    public Duck(){}

    public void quack(){
        if(quakeBehavior != null){
            quakeBehavior.quake();
        }
    }


    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    //显示鸭子
    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakeBehavior(QuakeBehavior quakeBehavior) {
        this.quakeBehavior = quakeBehavior;
    }
}
