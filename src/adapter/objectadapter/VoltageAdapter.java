package adapter.objectadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:17
 * 对象适配器
 * 被适配者聚合到适配器中
 * 实现适配接口
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){//聚合
        this.voltage220V = voltage220V;
    }


    @Override
    public int output5V() {
        //获取220V电压
        int destV = 0;
        if(voltage220V != null){
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器适配，转换中...");
            //转成5V
            destV = srcV / 44;
            System.out.println("适配成功，输出电压为:"+destV);
        }
        return destV;
    }
}
