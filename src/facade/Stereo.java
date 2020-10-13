package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 11:59
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    private Stereo(){}

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void up(){
        System.out.println("Stereo up....");
    }
}
