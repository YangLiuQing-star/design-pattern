package command;

/**
 * @author YangLiuQing
 * @date 2020/6/10 22:07
 * 创建命令接口
 */
public interface Command {

    //执行动作或者操作
    public void execute();
    //撤销动作或者操作
    public void undo();
}
