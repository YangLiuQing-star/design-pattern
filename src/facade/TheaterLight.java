package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 12:00
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){}

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void dim(){
        System.out.println("TheaterLight is dim");
    }

    public void bright(){
        System.out.println("TheaterLight bright...");
    }
}
