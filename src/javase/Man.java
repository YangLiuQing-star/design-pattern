package javase;

/**
 * @author YangLiuQing
 * @date 2020/6/14 7:32
 */
public class Man extends Person{

    boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人，吃饭...");
    }

    public void walk(){
        System.out.println("男人，走路...");
    }
}
