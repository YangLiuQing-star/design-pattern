package component;

/**
 * @author YangLiuQing
 * @date 2020/6/9 10:13
 */
public class Major extends OrganizationComponent{
    public Major(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("-"+getName());
    }


    //add，remove不需要重写，因为它是叶子结点，不用完成管理


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
