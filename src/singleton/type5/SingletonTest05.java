package singleton.type5;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 懒汉式2
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懒汉式，线程不安全...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//懒汉式2
//结论：在实际开发中，不能使用
class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){//当多线程通过if语句时，多个实例被创建，不能保证单例，不安全
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
