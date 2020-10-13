package adapter.objectadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:25
 * 类适配器模式
 * 聚合，组合代替继承
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======对象适配器模式=====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
