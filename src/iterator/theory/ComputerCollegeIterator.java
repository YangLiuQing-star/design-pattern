package iterator.theory;

import java.util.Iterator;

/**
 * @author YangLiuQing
 * @date 2020/6/11 16:44
 */
public class ComputerCollegeIterator implements Iterator{

    //以数组形式存储
    Department[] depts;
    int position = 0;//遍历的起始位置

    /**
     * 构造器
     * @param depts 传入要遍历的depts
     */
    public ComputerCollegeIterator(Department[] depts) {
        this.depts = depts;
    }

    /**
     * 判断数组position位置的下一个位置元素是否存在
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position >= depts.length || depts[position]==null){
            return false;
        }
        return true;
    }

    /**
     * 返回数组的下一个元素
     * @return
     */
    @Override
    public Object next() {
        Department dept = depts[position];
        position++;
        return dept;
    }

    //删除的方法空实现
    public void remove(){

    }
}
