package memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/12 6:16
 * 守护者对象，用来管理多个备忘录对象
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    //如果涉及多个备忘录对象的多种状态，使用HashMap进行管理

    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 获取第index个Memento对象
     * @param index
     * @return
     */
    public Memento get(int index){
        return mementoList.get(index);
    }


}
