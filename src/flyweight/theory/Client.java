package flyweight.theory;

/**
 * @author YangLiuQing
 * @date 2020/6/10 8:45
 */
public class Client {

    public static void main(String[] args) {
        //创建网站工厂类
        WebSiteFactory factory = new WebSiteFactory();
        //创建新闻形式的网站
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("张三"));
        //创建博客形式的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("李四"));
        //创建微信形式的网站
        WebSite webSite3 = factory.getWebSiteCategory("微信");
        webSite3.use(new User("王五"));
        webSite3.use(new User("赵六"));
        System.out.println("当前网站形式的总数:"+factory.getWebSiteCount());
    }
}
