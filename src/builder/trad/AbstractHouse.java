package builder.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/7 9:54
 * 抽象建造者
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
        System.out.println("房子构建成功...");
    }
}
