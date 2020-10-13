package respchain;

/**
 * @author YangLiuQing
 * @date 2020/6/13 8:23
 */
public class PurchaseRequest {

    private int id;
    private String type;
    private double price;

    //构造器
    public PurchaseRequest(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
