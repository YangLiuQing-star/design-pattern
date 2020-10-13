package factory.simplefactory.pizzastore.pizza;

/**
 * @author YangLiuQing
 * @date 2020/6/6 10:01
 */
public abstract class Pizza {

    //Pizza的名字
    private String name;

    //每种pizza的原材料不同，需要根据实际情况进行准备，这里设置成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking...");
    }

    public void cut(){
        System.out.println(name + "cutting...");
    }

    public void box(){
        System.out.println(name + "boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
