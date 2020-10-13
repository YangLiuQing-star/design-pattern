package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 11:55
 */
public class Projector {

    private static Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void focus(){
        System.out.println("Projector is focus");
    }

    public void pause(){
        System.out.println("Projector pause");
    }
}
