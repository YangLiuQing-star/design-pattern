package factory.absfactory.order;

import factory.absfactory.pizza.BJChessPizza;
import factory.absfactory.pizza.BJPepperPizza;
import factory.absfactory.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 20:17
 * 工厂子类
 */
public class BJFactory implements AbsFactory{

    @Override
    public Pizza makePizza(String orderType) {
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
