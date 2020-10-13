package prototype.trad;

/**
 * @author YangLiuQing
 * @date 2020/6/7 8:45
 */
public class Client {
    public static void main(String[] args) {
        //创建10只一模一样的羊
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3 = new Sheep("tom", 1, "白色");
        Sheep sheep4 = new Sheep("tom", 1, "白色");
        System.out.println("使用传统方式实现对象的创建...");
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
