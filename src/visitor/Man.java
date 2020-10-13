package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:21
 * 1.这里我们使用到双分派，即首先在客户端程序中，将具体的状态作为参数传给Man（第一次分派）
 * 2.然后Man类 调用作为参数的”具体方法“中的方法getManResult，同时将自己作为参数传入，完成了第二次分派
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
