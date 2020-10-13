package memento.theory;

/**
 * @author YangLiuQing
 * @date 2020/6/12 6:19
 */
public class Client {

    public static void main(String[] args) {
        //创建需要保存状态的对象
        Originator originator = new Originator();
        //创建守护者对象
        CareTaker taker = new CareTaker();
        //设置原始对象的状态
        originator.setStatue("攻击力100，防御力100");
        //将原始对象的当前状态保存到Memento，同时将Memento加入到CareTaker
        taker.add(originator.saveStateMemento());
        originator.setStatue("攻击力80，防御力60");
        taker.add(originator.saveStateMemento());

        originator.setStatue("攻击力40，防御力50");
        taker.add(originator.saveStateMemento());

        System.out.println("当前的状态为:"+originator.getStatue());

        //恢复到状态1 ---攻击力100，防御力100
        originator.getStateFromMemento(taker.get(0));

        System.out.println("恢复到状态1后，当前的状态为:"+originator.getStatue());
    }
}
