package com.principle.dependency.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/5 12:08
 * 依赖倒置原则
 * 核心思想：面向接口编程
 * 细节依赖抽象
 */
public class DependencyInversion {

    public static void main(String[] args) {
        //客户端无需改变
        Person p = new Person();
        p.receive(new Email());
        p.receive(new WeChat());
    }
}

//定义一个接口
interface IReceiver{
    public String getInfo();
}

//完成Person接收消息的功能
class Person {
    //Person类依赖接口，稳定性好
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息:Hello World!";
    }
}


//微信
class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息:Hi Hi Hi...";
    }
}
