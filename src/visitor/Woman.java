package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:23
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
