package com.principle.segregation;

/**
 * @author YangLiuQing
 * @date 2020/6/5 9:52
 * 接口隔离原则
 * 一个类对另外一个类的依赖，应该建立在最小接口上
 */
public class Segregation01 {

    public static void main(String[] args) {
        //A通过接口依赖B
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
    }
}

//接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B实现了Operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了Operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了Operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了Operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了Operation5");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D实现了Operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了Operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了Operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了Operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了Operation5");
    }
}

//A类通过Interface1依赖B类，但是只会用到1,2,3方法
class A {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface1 i){
        i.operation2();
    }

    public void depend3(Interface1 i){
        i.operation3();
    }
}

//C类通过Interface1依赖B类，但是只会用到1,4,5方法
class C {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface1 i){
        i.operation4();
    }

    public void depend3(Interface1 i){
        i.operation5();
    }
}
