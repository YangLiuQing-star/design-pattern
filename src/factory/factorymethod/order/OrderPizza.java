package factory.factorymethod.order;

import factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:54
 * 抽象工厂方法
 * 定义一个抽象方法，让各个工厂子类根据实际情况实现此方法
 */
public abstract class OrderPizza {

    //定义一个抽象方法，让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType = null;//披萨的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            if(pizza != null){
                //输出pizza的制作流程
                System.out.println("披萨制作中...");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("恭喜您，订购成功");
            }else{
                System.out.println("披萨的种类不存在，订购失败...");
                break;
            }

        }while(true);
}

    //获取客户需要订购的pizza种类
    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizza type~~~:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
