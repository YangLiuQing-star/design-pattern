package component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/9 10:13
 */
public class Department extends OrganizationComponent{

    //存放的是Department
    List<OrganizationComponent> ls = new ArrayList<>();

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }

    /**
     * 输出Department中包含的专业
     */
    @Override
    protected void print() {
        System.out.println("===="+getName()+"====");
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
