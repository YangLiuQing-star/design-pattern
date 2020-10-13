package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:19
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功
        Success success = new Success();
        //失败
        Fail fail = new Fail();
        //待定
        Wait wait = new Wait();

        structure.display(success);
        System.out.println("===========================");
        structure.display(fail);
        System.out.println("===========================");
        structure.display(wait);
    }
}
