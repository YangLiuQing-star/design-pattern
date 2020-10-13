package adapter.interfadapter;

/**
 * @author YangLiuQing
 * @date 2020/6/7 18:10
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            //根据需要，覆盖相应的方法，匿名对象
            public void operation1(){
                System.out.println("使用了operation1的方法");
            }
        };

        absAdapter.operation1();
    }
}
