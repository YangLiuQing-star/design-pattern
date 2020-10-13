package adapter.classadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:17
 * 适配器类
 * 1.继承被适配的类
 * 2.实现适配接口
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        //转成5V
        int destV = srcV / 44;
        return destV;
    }
}
