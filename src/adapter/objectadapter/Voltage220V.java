package adapter.objectadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 17:13
 * 被适配者
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("src = "+ src+"V");
        return src;
    }
}
