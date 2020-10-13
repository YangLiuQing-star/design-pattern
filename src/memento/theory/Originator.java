package memento.theory;

/**
 * @author YangLiuQing
 * @date 2020/6/12 6:09
 * 需要保存状态的类
 */
public class Originator {

    private String statue;

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    //编写一个方法，保存一个状态对象，并返回
    public Memento saveStateMemento(){
        return new Memento(statue);
    }

    //通过备忘录对象恢复状态
    public void getStateFromMemento(Memento memento){
        this.statue = memento.getStatue();
    }
}
