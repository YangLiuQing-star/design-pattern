package proxy.dynamic;

/**
 * @author YangLiuQing
 * @date 2020/6/10 9:17
 * 被代理对象
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("韩老师授课中...");
    }

    public void sayHello(String name){
        System.out.println("hello:"+name);
    }
}
