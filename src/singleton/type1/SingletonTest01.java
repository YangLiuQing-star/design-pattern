package singleton.type1;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:17
 * 单例模式
 * 某个类的实例只能有一个
 * 适用于需要频繁创建和销毁的对象，比如数据源，Session工厂
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//饿汉式（静态变量），类装载机制（JVM在装载类是是单例的）
//结论：可用，但是可能造成内存浪费
class Singleton {

    //1.构造器私有化，外部不能使用new来创建实例
    private Singleton(){}

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.对外部提供一个共有的静态方法
    public static Singleton getInstance() {
        return instance;
    }
}
