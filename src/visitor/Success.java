package visitor;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:24
 * 评价为成功
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男性给的评价是该歌手good");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性给的评价是该歌手good");
    }
}
