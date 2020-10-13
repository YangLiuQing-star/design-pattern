package adapter.classadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:25
 * 类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======类适配器模式=====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
