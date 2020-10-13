package com.principle.liskov.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/5 15:14
 * 里氏替换原则
 * 核心思想：所有能够使用基类的地方，必须能透明的使用其子类对象
 * 子类尽量不要重写父类的方法，在适当的情况下，使用依赖，聚合，组合的方式来解决问题
 */
public class Liskov {

    public static void main(String[] args) {
        //B类不再继承A类，调用者不会认为fun1是做减法
        A a = new A();
        System.out.println("11-3=" + a.fun1(11, 3));//11 - 3
        System.out.println("1-8=" + a.fun1(1, 8));//1 -8

        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11+3=" + b.fun1(11, 3));//这里本意是求出11-3
        System.out.println("1+8=" + b.fun1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.fun2(11, 3));

        //使用组合任然可以使用到A类的相关方法
        System.out.println("11 - 3 = "+ b.fun3(11,3));
    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的成员和方法写到Base类
}

class A extends Base{
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends Base {
    //如果B类需要使用A类的方法，使用组合关系
    private A a = new A();

    public int fun1(int a,int b){
        return a + b;
    }

    public int fun2(int a,int b){
        return fun1(a,b) + 9;
    }

    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }
}
