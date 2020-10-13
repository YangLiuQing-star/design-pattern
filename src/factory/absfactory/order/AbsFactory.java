package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 20:17
 * 抽象工厂模式的抽象层
 *
 */
public interface AbsFactory {

    //留给工厂子类自己实现
    public Pizza makePizza(String orderType);
}
