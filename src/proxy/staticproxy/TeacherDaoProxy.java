package proxy.staticproxy;

/**
 * @author YangLiuQing
 * @date 2020/6/10 9:24
 * 代理对象
 */
public class TeacherDaoProxy implements ITeacherDao{
    //通过接口来聚合目标对象
    private ITeacherDao teacherDao;

    //构造器
    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("静态代理开始...");
        teacherDao.teach();
        System.out.println("静态代理结束...");
    }
}
