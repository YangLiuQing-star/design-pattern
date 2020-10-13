package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 11:58
 */
public class Screen {

    private static Screen instance = new Screen();

    private Screen(){}

    public static Screen getInstance(){
        return instance;
    }

    public void down(){
        System.out.println("Screen on");
    }

    public void up(){
        System.out.println("Screen off");
    }

}
