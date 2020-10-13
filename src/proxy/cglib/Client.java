package proxy.cglib;

/**
 * @author YangLiuQing
 * @date 2020/6/10 20:03
 */
public class Client {

    public static void main(String[] args) {
        //1.创建目标对象
        TeacherDao target = new TeacherDao();
        //2.获取代理对象，并且把目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        //3.执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        proxyInstance.teach();
        String res = proxyInstance.sayHello("韩老师");
        System.out.println(res);
    }
}
