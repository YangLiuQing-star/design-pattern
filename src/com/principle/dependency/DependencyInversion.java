package com.principle.dependency;

/**
 * @author YangLiuQing
 * @date 2020/6/5 12:08
 * 依赖倒置原则
 * 核心思想：面向接口编程
 * 细节依赖抽象，抽象不应该依赖细节
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}

//完成Person接收消息的功能
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

//方式1
//1.简单
//2.如果我们获取的对象是微信，短信等，则新增类，同时Person类也要新增响应的方法
//3.解决思路：引入一个抽象的接口IReceiver，表示接收者，Person类与接口发生依赖
//4.因为Email，微信等都属于接收者的范围，它们各自IReceiver接口，此时符合依赖倒置原则
class Email {
    public String getInfo(){
        return "电子邮件信息:Hello World!";
    }
}
