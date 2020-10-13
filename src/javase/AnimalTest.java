package javase;

import java.sql.Connection;

/**
 * @author YangLiuQing
 * @date 2020/6/14 19:32
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{

    public void eat(){
        System.out.println("动物，进食");
    }

    public void shout(){
        System.out.println("动物，叫");
    }
//
//    public void func(Dog dog){
//        dog.eat();
//        dog.shout();
//    }
//
//    public void func(Cat cat){
//        cat.eat();
//        cat.shout();
//    }

}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪，汪，汪");
    }


}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵，喵，喵");
    }
}

class Order{

    public void method(Object obj){

    }
}

class Driver{

    public void doData(Connection con){
        //规范的步骤区操作数据库

    }
}
