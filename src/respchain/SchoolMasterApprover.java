package respchain;

/**
 * @author YangLiuQing
 * @date 2020/6/13 8:36
 */
public class SchoolMasterApprover extends Approver{
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 30000){
            System.out.println("请求编号:id="+purchaseRequest.getId()+"被"+name+"处理");
        }else{
            System.out.println("请求编号:id="+purchaseRequest.getId()+"不合法，无法被处理");
        }
    }
}
