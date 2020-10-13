package builder.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 10:25
 * 具体的建造者
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasic("100m");
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("20cm");
        System.out.println("高楼砌墙20m");
    }

    @Override
    public void roofed() {
        house.setRoof("透明的玻璃幕墙");
        System.out.println("高楼透明的屋顶");
    }
}
