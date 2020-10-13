package strategy.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/12 22:01
 */
public class NoQuakeBehavior implements QuakeBehavior{
    @Override
    public void quake() {
        System.out.println("不会叫");
    }
}
