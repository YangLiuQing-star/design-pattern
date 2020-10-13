package proxy.staticproxy;

/**
 * @author YangLiuQing
 * @date 2020/6/10 9:24
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao targetObject = new TeacherDao();
        //创建代理对象，同时将目标对象聚合到代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(targetObject);
        //通过代理对象调用到目标对象的方法
        proxy.teach();
    }
}
