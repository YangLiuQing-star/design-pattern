package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:44
 * 评价为待定
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是该歌手待定");
    }
}
