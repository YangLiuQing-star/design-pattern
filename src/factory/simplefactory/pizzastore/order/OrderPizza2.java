package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YangLiuQing
 * @date 2020/6/6 16:32
 */
public class OrderPizza2 {


    public OrderPizza2(){
        Pizza pizza = null;
        String pizzaType = "";//用户输入披萨的类型

        do {
            pizzaType = getType();//获取披萨类型
            pizza = SimpleFactory.createPizza2(pizzaType);
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
            System.out.println("Please Input Pizza Type:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
