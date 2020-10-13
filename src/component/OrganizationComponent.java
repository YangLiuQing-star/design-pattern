package component;

/**
 * @author YangLiuQing
 * @date 2020/6/9 9:59
 * 抽象层
 */
public abstract class OrganizationComponent {
    private String name;//名字
    private String des;//说明

    protected void add(OrganizationComponent organizationComponent){
        //默认实现，因为叶子结点不需要重写此方法
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现，因为叶子结点不需要重写此方法
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //学校，学院，专业都具有打印方法
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
