package memento.game;

/**
 * @author YangLiuQing
 * @date 2020/6/12 7:34
 * 守护者对象
 */
public class CareTaker {

    private Memento memento;

    public CareTaker(Memento memento) {
        this.memento = memento;
    }
}
