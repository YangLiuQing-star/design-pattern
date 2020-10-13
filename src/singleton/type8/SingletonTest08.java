package singleton.type8;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 枚举实现单例模式
 *
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        System.out.println("枚举实现单例模式...");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOk();
    }
}

//使用枚举，可以使用单例，推荐使用
enum  Singleton {
    INSTANCE;//属性

    public void sayOk(){
        System.out.println("ok....");
    }
}
