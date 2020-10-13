package bridge;

/**
 * @author YangLiuQing
 * @date 2020/6/8 20:57
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        System.out.println("直立样式手机");
        super.open();
    }

    public void close(){
        System.out.println("直立样式手机");
        super.close();
    }

    public void call(){
        System.out.println("直立样式手机");
        super.call();
    }
}
