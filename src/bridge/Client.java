package bridge;

/**
 * @author YangLiuQing
 * @date 2020/6/8 21:13
 */
public class Client {

    public static void main(String[] args) {
        //手机 = 样式 + 品牌
        Phone phone = new FoldedPhone(new XiaoMi());

        phone.open();
        phone.call();
        phone.close();

        System.out.println("=========================");

        Phone phone2 = new FoldedPhone(new Vivo());

        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("=========================");
        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("=========================");
        Phone phone4  = new FoldedPhone(new HuaWei());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
