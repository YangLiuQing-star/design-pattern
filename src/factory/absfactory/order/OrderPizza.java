package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YangLiuQing
 * @date 2020/6/6 17:54
 * 抽象工厂
 * 定义一个抽象工厂，让各个工厂子类根据实际情况实现抽象工厂
 */
public class OrderPizza {

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    //聚合抽象工厂
    private AbsFactory absFactory = null;

    private void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        Pizza pizza = null;
        String orderType = null;//披萨的类型
        do{
            orderType = getType();
            System.out.println("使用的是抽象工厂模式~~~");
            //this.absFactory可能是北京的或者伦敦的工厂子类
            pizza = this.absFactory.makePizza(orderType);
            if(pizza != null){
                //输出pizza的制作流程
                System.out.println("披萨制作中...~~~");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("恭喜您，订购成功~~~");
            }else{
                System.out.println("披萨种类不存在，订购失败~~~");
                break;
            }

        }while(true);
    }

    //获取客户需要订购的pizza种类
    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨的种类:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
