/**
 * @author YangLiuQing
 * @date 2020/6/23 18:37
 * 求出200以内的质数
 */
public class test {

    public static void main(String[] args) {
        int j;
        for(int i = 2;i <= 280;i++){
            for(j = 2;j < i;j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j == i){
                System.out.println(i);
            }
        }
    }

}
