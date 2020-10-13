package singleton.type6;

/**
 * @author YangLiuQing
 * @date 2020/6/6 8:59
 * 懒汉式2
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("双重检查，推荐使用...");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//双重检查
//结论：解决线程安全问题，同时解决懒加载问题，效率较高，推荐使用
class Singleton {

    //volatile实时更新instance的值到主存
    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){//第一次判断
            synchronized (Singleton.class){//a,b
                if(instance == null){//第二次判断
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
