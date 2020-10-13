package com.principle.liskov;

/**
 * @author YangLiuQing
 * @date 2020/6/5 15:14
 * 里氏替换原则
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.fun1(11, 3));//11 - 3
        System.out.println("1-8=" + a.fun1(1, 8));//1 -8

        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.fun1(11, 3));//这里本意是求出11-3
        System.out.println("1-8=" + b.fun1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.fun2(11, 3));
    }
}

class A {
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends A {
    //重写了父类的方法
    public int fun1(int a,int b){
        return a + b;
    }

    public int fun2(int a,int b){
        return fun1(a,b) + 9;
    }
}
