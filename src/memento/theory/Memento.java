package memento.theory;

/**
 * @author YangLiuQing
 * @date 2020/6/12 6:11
 * 备忘录模式
 * 备忘录对象
 */
public class Memento {

    private String statue;

    public Memento(String statue){
        this.statue = statue;
    }

    public String getStatue() {
        return statue;
    }
}
