package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:23
 */
public abstract class Person {

    //提供一个方法，让访问者（Action）可以访问
    public abstract void accept(Action action);
}
