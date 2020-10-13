package template;

/**
 * @author YangLiuQing
 * @date 2020/6/10 20:51
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("制作花生豆浆:");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();

        System.out.println("----------------------");

        System.out.println("制作黑豆豆浆:");
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();

        System.out.println("----------------------");

        System.out.println("制作纯豆浆:");
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
