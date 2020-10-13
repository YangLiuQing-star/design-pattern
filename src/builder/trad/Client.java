package builder.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/7 9:56
 * 建造者模式（生成器模式）
 * 属于构建型模式
 * 解决产品和产品构建过程耦合性过强
 */
public class Client{
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
