package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.ChessPizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:37
 * 简单工厂设计模式
 * 核心思想：创建了一个实例化对象的类，由该类封装创建对象的代码
 * 适用于需要大量创建某类的实例时
 */
public class SimpleFactory {

    /**
     * 根据输入类型，返回对应的pizza对象
     * @param pizzaType
     * @return
     */
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        System.out.println("***使用简单工厂模式:");
        if("greek".equals(pizzaType)){
            pizza = new GreekPizza();
            pizza.setName("*希腊披萨");
        }else if("chess".equals(pizzaType)){
            pizza = new ChessPizza();
            pizza.setName("*奶酪披萨");
        }else if("pepper".equals(pizzaType)){
            pizza = new PepperPizza();
            pizza.setName("*胡椒披萨");
        }
        return pizza;
    }

    //简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String pizzaType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式2:");
        if("greek".equals(pizzaType)){
            pizza = new GreekPizza();
            pizza.setName("**希腊披萨");
        }else if("chess".equals(pizzaType)){
            pizza = new ChessPizza();
            pizza.setName("**奶酪披萨");
        }else if("pepper".equals(pizzaType)){
            pizza = new PepperPizza();
            pizza.setName("**胡椒披萨");
        }
        return pizza;
    }
}
