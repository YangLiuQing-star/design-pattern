package javase;

/**
 * @author YangLiuQing
 * @date 2020/6/14 7:36
 * 多态性
 * 1.一个事物的多种形态
 * 2.多态性：父类引用指向子类对象
 * 3.多态的使用，虚拟方法调用
 *  编译，看左边，运行看右边
 * 4.多态的使用前提
 * 4.1类的继承关系，4.2方法的重写
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //多态性：父类引用指向子类对象
        Person p2 = new Man();
        Person p3 = new Woman();

        //多态的使用，当子父类同名同参数时，实际执行的是子类重写父类的方法---虚拟方法调用
        p2.eat();

        //p2.earnMoney();
    }
}
