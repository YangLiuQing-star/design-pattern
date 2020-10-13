package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:24
 * 评价为失败
 * 具体的访问者
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是该歌手失败");
    }
}
