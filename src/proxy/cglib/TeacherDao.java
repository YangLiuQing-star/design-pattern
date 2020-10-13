package proxy.cglib;

/**
 * @author YangLiuQing
 * @date 2020/6/10 19:49
 * 目标类对象
 */
public class TeacherDao {

    public void teach(){
        System.out.println("韩老师授课中...，我是cglib代理，不需要实现接口");
    }

    public String sayHello(String name){
        return "hello"+name;
    }
}
