package memento.game;

/**
 * @author YangLiuQing
 * @date 2020/6/12 7:34
 * 游戏角色
 */
public class GameRole {

    private int attack;
    private int defense;

    public GameRole(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    //保存当前状态到备忘录，并返回一个备忘录对象
    public Memento saveStatus(){
        return new Memento(attack,defense);
    }

    //恢复状态的方法，将备忘录中保存的状态设置回原始对象
    public void recover(Memento memento){
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    @Override
    public String toString() {
        return "attack=" + attack + ", defense=" + defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
