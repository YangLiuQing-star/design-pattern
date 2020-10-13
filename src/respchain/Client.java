package respchain;

/**
 * @author YangLiuQing
 * @date 2020/6/13 8:38
 */
public class Client {

    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, "机房购买电脑", 20000);
        //创建处理者处理请求
        Approver zs = new DepartmentApprover("张三");
        Approver ls = new CollegeApprover("李四");
        Approver ww = new ViceSchoolMasterApprover("王五");
        Approver zl = new SchoolMasterApprover("赵六");
        //设置当前处理者的后继处理者（可以构成环状）
        zs.setApprover(ls);
        ls.setApprover(ww);
        ww.setApprover(zl);
        //zl.setApprover(zs);
        //当前处理者处理请求
        zs.processRequest(request);
    }
}
