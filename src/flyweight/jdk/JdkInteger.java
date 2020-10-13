package flyweight.jdk;

/**
 * @author YangLiuQing
 * @date 2020/6/10 9:02
 */
public class JdkInteger {

    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(127);
        Integer n2 = Integer.valueOf(127);
        System.out.println(n1==n2);
    }
}
