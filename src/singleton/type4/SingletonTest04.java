package singleton.type4;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 懒汉式2
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懒汉式，线程安全，但效率太低...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//懒汉式2
//结论：在实际开发中，每次都需要进行方法同步处理，不推荐使用，效率太低
class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程不安全问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
