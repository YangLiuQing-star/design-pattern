package prototype.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/7 8:44
 * 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
 * 创建型设计模式
 * 工作原理：对象.clone
 */
public class Sheep implements Cloneable{

    private String name;
    private int age;
    private String color;

    private String address = "蒙古羊";//新增属性

    public Sheep friend;//引用类型，克隆出来是进行浅拷贝，即引用传递

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //克隆该实例，使用默认的克隆方法来实现
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try{
            sheep = (Sheep) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
