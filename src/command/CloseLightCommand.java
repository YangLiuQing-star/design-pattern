package command;

/**
 * @author YangLiuQing
 * @date 2020/6/10 22:09
 */
public class CloseLightCommand implements Command{

    private LightReceiver light;

    public CloseLightCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.close();
    }

    @Override
    public void undo() {
        light.open();
    }
}
