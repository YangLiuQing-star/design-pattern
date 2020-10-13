package flyweight.theory;

/**
 * @author YangLiuQing
 * @date 2020/6/10 8:38
 */
public class ConcreteWebSite extends WebSite{
    //共享，内部状态
    private String type;//网站发布的形式

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:"+type+","+user.getName()+"正在使用此网站...");
    }
}
