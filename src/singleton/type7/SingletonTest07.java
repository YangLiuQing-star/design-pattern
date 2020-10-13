package singleton.type7;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 静态内部类实例单例模式
 *
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("静态内部类实例单例模式...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//静态内部类实现单例模式
//结论：解决线程安全问题，同时解决懒加载问题，强烈推荐使用
//原理：使用来JVM在类装载时是单例的
//静态内存类的2个特点：
// 1.外部类的装载，不会导致静态内部类的装载，保证懒加载
//2.加载静态内部类时实例化对象，因为实例化对象是线程安全的，从而保证线程安全
class Singleton {

    //1.构造器私有化
    private Singleton(){

    }

    //2.写一个静态内部类，该类中有一个静态属性Singleton
    public static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
