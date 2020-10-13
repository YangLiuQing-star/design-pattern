package respchain;

/**
 * @author YangLiuQing
 * @date 2020/6/13 8:35
 */
public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 20000){
            System.out.println("请求编号:id="+purchaseRequest.getId()+"被"+name+"处理");
        }else{
            //请求传递给后继者进行处理
            approver.processRequest(purchaseRequest);
        }
    }
}
