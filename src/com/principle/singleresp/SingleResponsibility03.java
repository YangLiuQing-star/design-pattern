package com.principle.singleresp;

/**
 * @author YangLiuQing
 * @date 2020/6/5 9:18
 * 单一职责
 */
public class SingleResponsibility03 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

//方式3
//1.这种修改方法没有对原来的类做大的修改，只是增加方法
//2.虽然在类级别上没有遵守单一职责，但是在方法级别上任然遵循单一职责
class Vehicle2 {
    public void runRoad(String vehicle){
        System.out.println(vehicle+" 在公路运行...");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+" 在天上运行...");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle+" 在水中运行...");
    }
}

