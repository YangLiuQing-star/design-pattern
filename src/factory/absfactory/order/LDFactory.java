package factory.absfactory.order;

import factory.absfactory.pizza.LDChessPizza;
import factory.absfactory.pizza.LDPepperPizza;
import factory.absfactory.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 20:17
 * 工厂子类
 */
public class LDFactory implements AbsFactory{

    @Override
    public Pizza makePizza(String orderType) {
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
