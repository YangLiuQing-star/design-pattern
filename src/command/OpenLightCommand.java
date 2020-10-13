package command;

/**
 * @author YangLiuQing
 * @date 2020/6/10 22:08
 * 具体的命令
 */
public class OpenLightCommand implements Command{

    //1.聚合接受者
    private LightReceiver light;

    public OpenLightCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //2.调用接受者的方法，执行命令
        light.open();
    }

    //撤销方法
    @Override
    public void undo() {
        light.close();
    }
}
