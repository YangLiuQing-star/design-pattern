package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:19
 * 抽象的访问者
 */
public abstract class Action {

    //获取男性的测评结果
    public abstract void getManResult(Man man);
    //获取女性的测评结果
    public abstract void getWomanResult(Woman woman);
}
