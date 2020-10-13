package factory.factorymethod.order;

import factory.factorymethod.pizza.BJChessPizza;
import factory.factorymethod.pizza.BJPepperPizza;
import factory.factorymethod.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 18:02
 * 工厂子类
 * 北京披萨的工厂
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("chess".equals(orderType)){
            pizza = new BJChessPizza();
        }
        if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
