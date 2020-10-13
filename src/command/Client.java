package command;

/**
 * @author YangLiuQing
 * @date 2020/6/10 22:32
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("使用命令模式，完成通过遥控器，对电灯的相关操作");
        //创建电灯
        LightReceiver light = new LightReceiver();
        //创建电灯相关的命令
        OpenLightCommand openLightCommand = new OpenLightCommand(light);
        CloseLightCommand closeLightCommand = new CloseLightCommand(light);
        //创建遥控器
        RemoteController control = new RemoteController();
        //给遥控器设置相关开，关命令
        control.setCommand(0,openLightCommand,closeLightCommand);

        System.out.println("使用遥控器控制电灯");
        System.out.println("-------------按下电灯的开按钮-----------");
        //使用遥控器打开电灯
        control.onButtonWasPushed(0);
        System.out.println("-------------按下电灯的关按钮-----------");
        //使用遥控器关闭电灯
        control.offButtonWasPushed(0);
        System.out.println("-------------按下电灯的撤销按钮-----------");
        //使用遥控器撤销关闭电灯的操作
        control.undoButtonWasPushed();

        System.out.println();
        System.out.println();

        System.out.println("使用遥控器控制电视");
        TVReceiver tv = new TVReceiver();
        TVOpenCommand tvOpenCommand = new TVOpenCommand(tv);
        TVCloseCommand tvCloseCommand = new TVCloseCommand(tv);
        control.setCommand(1,tvOpenCommand,tvCloseCommand);
        System.out.println("-------------按下电视机的开按钮-----------");
        control.onButtonWasPushed(1);
        System.out.println("-------------按下电视机的关按钮-----------");
        control.offButtonWasPushed(1);
        System.out.println("-------------按下电视机的撤销按钮-----------");
        control.undoButtonWasPushed();
    }
}
