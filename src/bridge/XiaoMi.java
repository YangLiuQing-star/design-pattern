package bridge;

/**
 * @author YangLiuQing
 * @date 2020/6/8 20:52
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机...");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机...");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话...");
    }
}
