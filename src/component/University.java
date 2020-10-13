package component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/9 10:07
 * Composite，可以管理学院
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> ls = new ArrayList<>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    /**
     * 输出University中包含的学院
     */
    @Override
    protected void print() {
        System.out.println("----"+getName()+"-----");
        for(OrganizationComponent item : ls){
            item.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        ls.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        ls.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
