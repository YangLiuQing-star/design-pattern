package singleton.type3;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 懒汉式1
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式，线程不安全...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//懒汉式1
//结论：在单线程中可以使用，在多线程中不能使用
class Singleton {

    private static Singleton instance;

    private Singleton(){
    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance实例
    public static Singleton getInstance(){
        if(instance == null){//当多线程通过if语句时，多个实例被创建，不能保证单例，不安全
            instance = new Singleton();
        }
        return instance;
    }
}
