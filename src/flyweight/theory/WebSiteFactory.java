package flyweight.theory;

import java.util.HashMap;

/**
 * @author YangLiuQing
 * @date 2020/6/10 8:40
 * 网站工厂类，根据需求，返回一个具体的网站
 */
public class WebSiteFactory {

    //集合，充当池
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站的发布形式，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取当前网站形式的总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
