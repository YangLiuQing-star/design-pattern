package factory.factorymethod.order;

import factory.factorymethod.pizza.LDChessPizza;
import factory.factorymethod.pizza.LDPepperPizza;
import factory.factorymethod.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 18:02
 * 工厂子类
 * 伦敦披萨的工厂
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("chess".equals(orderType)){
            pizza = new LDChessPizza();
        }
        if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
