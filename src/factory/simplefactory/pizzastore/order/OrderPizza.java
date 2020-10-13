package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.ChessPizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:09
 */
public class OrderPizza {

//    public OrderPizza(){
//        Pizza pizza = null;
//        String pizzaType;//披萨的类型
//
//        do{
//            pizzaType = getType();
//            if("greek".equals(pizzaType)){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if("chess".equals(pizzaType)){
//                pizza = new ChessPizza();
//                pizza.setName("奶酪披萨");
//            }else if("pepper".equals(pizzaType)){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            }else{
//                break;
//            }
//
//            //输出pizza的制作流程
//            System.out.println("披萨制作中...");
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//            System.out.println("恭喜您，订购成功");
//        }while(true);
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory = null;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String pizzaType = "";//用户输入披萨的类型
        this.simpleFactory = simpleFactory;//聚合，简单工厂
        do {
            pizzaType = getType();//获取披萨类型
            pizza = simpleFactory.createPizza(pizzaType);
            if(this.pizza != null){
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
            System.out.println("please input pizza type:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
