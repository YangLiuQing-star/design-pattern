package facade;

/**
 * @author YangLiuQing
 * @date 2020/6/9 12:01
 */
public class Client {

    public static void main(String[] args) {
        //如果直接调用很麻烦，扩展也不方便
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.ready();
        homeTheater.play();
        homeTheater.pause();
        homeTheater.end();
    }
}
