package memento.game;

/**
 * @author YangLiuQing
 * @date 2020/6/12 7:34
 */
public class Memento {

    private int attack;
    private int defense;

    public Memento(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
