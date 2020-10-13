package builder.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 10:24
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasic("5m");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("10cm");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoof("瓦片");
        System.out.println("普通房子的屋顶");
    }
}
