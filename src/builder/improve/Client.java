package builder.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 10:33
 */
public class Client {

    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //创建普通房子的指挥者
        HouseDirector director = new HouseDirector(commonHouse);
        //完成盖房子，返回产品
        House house = director.constructHouse();
        System.out.println(house);
        System.out.println("------------------------------");

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        director.setHouseBuilder(highBuilding);
        //返回产品
        House highHouse = director.constructHouse();
        System.out.println(highHouse);
    }
}
