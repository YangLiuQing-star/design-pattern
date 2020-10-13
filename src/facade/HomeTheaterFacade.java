package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 18:05
 * 外观模式
 * 影院
 */
public class HomeTheaterFacade {

    //定义各个子系统的对象
    private TheaterLight light;
    private Popcorn popcorn;
    private DVDPlayer player;
    private Projector projector;
    private Stereo stereo;
    private Screen screen;

    public HomeTheaterFacade() {
        this.light = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.player = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
    }

    //操作分成4步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        popcorn.on();
        stereo.on();
        player.on();
        light.dim();
    }

    public void play(){
        player.play();
    }

    public void pause(){
        player.pause();
    }

    public void end(){
        popcorn.off();
        light.off();
        screen.up();
        popcorn.off();
        stereo.off();
        player.off();
    }

}
