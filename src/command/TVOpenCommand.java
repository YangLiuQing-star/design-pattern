package command;

/**
 * @author YangLiuQing
 * @date 2020/6/11 5:58
 */
public class TVOpenCommand implements Command{

    //聚合接收者对象
    private TVReceiver tv;

    public TVOpenCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }

    @Override
    public void undo() {
        tv.close();
    }
}
