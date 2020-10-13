package singleton.type2;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:17
 * 单例模式
 * 某个类的实例只能有一个
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//饿汉式（静态代码块），类装载机制
//结论：可用，但是可能造成内存浪费
class Singleton {

    //1.构造器私有化，外部不能使用new来创建实例
    private Singleton(){}

    //2.本类内部创建对象实例（静态代码块）
    private static Singleton instance;


    {
        instance  = new Singleton();
    }


    //3.对外部提供一个共有的静态方法
    public static Singleton getInstance() {
        return instance;
    }
}
