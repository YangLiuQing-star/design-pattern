package component;

/**
 * @author YangLiuQing
 * @date 2020/6/9 10:19
 */
public class Client {

    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("北京大学","中国的顶级大学");

        //创建学院
        OrganizationComponent computerDept = new Department("计算机学院","计算机学院");
        OrganizationComponent infoDept = new Department("信息工程学院","信息工厂学院");

        //学院加入大学
        university.add(computerDept);
        university.add(infoDept);

        //创建专业
        computerDept.add(new Major("网络工程","就业前景不错"));
        computerDept.add(new Major("软件工程","就业前景不错"));
        computerDept.add(new Major("物联网工程","嵌入式工程师"));

        //专业加入学院
        infoDept.add(new Major("通信工程","学起来有难度"));
        infoDept.add(new Major("信息工程","易学"));

        university.print();

        System.out.println("------------------------");

        computerDept.print();
    }
}
