package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 11:51
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");
    }

    public void play(){
        System.out.println("DVC is playing");
    }

    public void pause(){
        System.out.println("DVD pause");
    }
}
