package adapter.classadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:20
 */
public class Phone {

    /**
     * 充电方法
     */
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("转换成功，电压为5V，可以充电...");
        }else{
            System.out.println("电压过高或者过低，无法充电!");
        }
    }
}
