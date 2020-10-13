package strategy.jdk;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author YangLiuQing
 * @date 2020/6/13 7:43
 */
public class JdkTest {

    public static void main(String[] args) {
        Integer[] data = {3,1,5,2,4};

        //方式1

        //1.匿名类对象new Comparator<Integer>() {...}
        //2.对象new Comparator{...}是策略接口的对象
        //3.compare方法中指定具体的处理方式
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };

        //4.根据不同的策略接口，得到不同的策略对象
        Arrays.sort(data,comparator);

        System.out.println(Arrays.toString(data));

        //方式2，使用lambda表达式实现策略模式
        Integer[] data2 = {19,11,12,18,14,13};

        Arrays.sort(data2,(var1,var2) -> {
            if(var1.compareTo(var2) > 0){
                return 1;
            }else{
                return -1;
            }
        });

        System.out.println("data2 ="+Arrays.toString(data2) );
    }
}
