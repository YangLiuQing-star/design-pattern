package memento.game;

/**
 * @author YangLiuQing
 * @date 2020/6/12 7:34
 */
public class Client {

    public static void main(String[] args) {
        //创建原始对象
        GameRole role = new GameRole(100, 100);
        //保存原始对象的状态到备忘录
        Memento memento = role.saveStatus();
        System.out.println("原始状态:"+role);
        role.setAttack(80);
        role.setDefense(60);
        System.out.println("修改后的状态:"+role);
        role.recover(memento);
        System.out.println("恢复后的当前状态:"+role);
    }
}
