package decorator;

/**
 * @author YangLiuQing
 * @date 2020/6/9 7:35
 * 被装饰者
 */
public abstract class Drink {

    private String description = "";
    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用，子类实现
    public abstract float cost();
}
