package command;

/**
 * @author YangLiuQing
 * @date 2020/6/11 5:59
 */
public class TVCloseCommand implements Command{

    private TVReceiver tv;

    public TVCloseCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }

    @Override
    public void undo() {
        tv.open();
    }
}
