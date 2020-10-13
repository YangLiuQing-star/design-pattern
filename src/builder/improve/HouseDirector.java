package builder.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 10:27
 * 指挥者
 * 指定制作流程，返回产品
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null;

    //构造器传入
    HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //set传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
