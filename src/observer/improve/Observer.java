package observer.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/11 18:45
 * 观察者接口，由观察者实现
 */
public interface Observer {

    public void update(float temperature,float pressure,float humidity);
}
