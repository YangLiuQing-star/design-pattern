package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:56
 */
public class CoffeeBar {

    public static void main(String[] args) {
        //装饰者模式下的订单：2巧克力+1牛奶+LongBlack

        //1.LongBlack
        Drink order = new LongBlack();
        System.out.println("美式咖啡的描述:"+order.getDescription());
        System.out.println("美式咖啡的价格:"+order.cost());
        //牛奶
        order = new Milk(order);
        System.out.println("加入一份牛奶的描述:"+order.getDescription());
        System.out.println("加入一份牛奶的价格:"+order.cost());//5+3

        //巧克力1
        order = new Chocolate(order);//8+2
        System.out.println("加入一份巧克力的描述:"+order.getDescription());
        System.out.println("加入一份巧克力的价格:"+order.cost());

        //巧克力2
        order = new Chocolate(order);
        System.out.println("加入一份巧克力的描述:"+order.getDescription());
        System.out.println("加入一份巧克力的价格:"+order.cost());

        //订购一份无因咖啡
        Drink order2 = new Decaf();
        System.out.println("无因咖啡的描述:"+order2.getDescription());
        System.out.println("无因咖啡的价格:"+order2.cost());

        //给无因咖啡加一份牛奶
        order2 = new Milk(order2);
        System.out.println("加入一份牛奶的描述:"+order2.getDescription());
        System.out.println("加入一份牛奶的价格:"+order2.cost());
    }
}
