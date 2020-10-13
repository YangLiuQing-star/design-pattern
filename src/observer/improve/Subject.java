package observer.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/11 18:44
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
