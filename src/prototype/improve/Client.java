package prototype.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 8:45
 * 克隆羊问题
 */
public class Client {
    public static void main(String[] args) {
        //创建10只一模一样的羊
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.friend = new Sheep("jack",1,"黑色");
        Sheep sheep1 = (Sheep) sheep.clone();

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("使用原型模式完成对象的创建.....");
        System.out.println("sheep1="+sheep+"sheep1.friend = "+sheep1.friend.hashCode());
        System.out.println("sheep2="+sheep+"sheep2.friend = "+sheep2.friend.hashCode());
        System.out.println("sheep3="+sheep+"sheep3.friend = "+sheep3.friend.hashCode());
        System.out.println("sheep4="+sheep+"sheep4.friend = "+sheep4.friend.hashCode());
        System.out.println("sheep5="+sheep+"sheep5.friend = "+sheep5.friend.hashCode());

    }
}
