package iterator.theory;

import java.util.Iterator;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/11 16:50
 */
public class InfoCollegeIterator implements Iterator{
    //以集合形式存储
    private List<Department> ls;
    int index = -1;//索引

    /**
     * 构造器
     * @param ls 传入要遍历的List集合
     */
    public InfoCollegeIterator(List<Department> ls) {
        this.ls = ls;
    }

    //判断List中有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= ls.size()-1){
            return false;
        }
        return true;
    }

    /**
     * 返回List中当前位置的下一个位置的值
     * @return
     */
    @Override
    public Object next() {
        index++;
        Department dept = ls.get(index);
        return dept;
    }

    //删除
    public void remove(){

    }
}
