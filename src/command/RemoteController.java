package command;

/**
 * @author YangLiuQing
 * @date 2020/6/10 22:17
 */
public class RemoteController {

    //聚合开，关命令的数组
    private Command[] onCommands;
    private Command[] offCommands;

    //执行撤销命令
    private Command undoCommand;

    /**
     * 构造器，进行初始化
     */
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i = 0; i < 5;i++){
            //初始化为开，关命令为空命令
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给遥控器设置你需要的命令
     * @param no 第no+1组命令
     * @param openCommand  开命令
     * @param closeCommand 关命令
     */
    public void setCommand(int no,Command openCommand,Command closeCommand){
        onCommands[no] = openCommand;
        offCommands[no] = closeCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no){
        //找到按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        //记录本次执行的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下关的按钮
    public void offButtonWasPushed(int no){
        //找到按下的关的按钮，并调用对应的方法
        offCommands[no].execute();
        //记录本次执行的操作，用于撤销
        undoCommand = offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
