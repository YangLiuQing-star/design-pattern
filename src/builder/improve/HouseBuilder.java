package builder.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 10:20
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //编写建造流程的方法

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建成房子后，返回房子
    public House buildHouse(){
        return house;
    }
}
