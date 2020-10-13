package respchain;

/**
 * @author YangLiuQing
 * @date 2020/6/13 8:26
 */
public abstract class Approver {

    String name;
    Approver approver;//下一个处理者

    //处理审批请求，留给子类处理
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public Approver(String name){
        this.name = name;
    }

    //设置下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
}
