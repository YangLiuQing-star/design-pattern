package factory.simplefactory.pizzastore.order;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:18
 * 相当于客户端
 * 发起订购任务
 */
public class PizzaStore {

    public static void main(String[] args) {
        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("退出程序...");
        new OrderPizza2();
    }
}
