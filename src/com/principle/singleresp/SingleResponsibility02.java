package com.principle.singleresp;

/**
 * @author YangLiuQing
 * @date 2020/6/5 9:18
 * 单一职责
 */
public class SingleResponsibility02 {

    public static void main(String[] args) {
        RoadVehicle car = new RoadVehicle();
        WaterVehicle boat = new WaterVehicle();
        AirVehicle airplane = new AirVehicle();
        car.run("汽车");
        boat.run("轮船");
        airplane.run("飞机");
    }
}

//方案2
//1.遵守单一职责原则
//2.改动过大，将类分解，同时修改客户端
//3.改进：直接修改Vehicle类
class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路运行...");
    }
}

class WaterVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+" 在水中运行...");
    }
}

class AirVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+" 在天上运行...");
    }
}

