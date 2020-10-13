package state.money;

public class ClientTest {

	public static void main(String[] args) {
		Context context = new Context();
		//设置当前状态
		context.setState(new PublishState());
        //System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("审核失败");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
        
	}

}
