package iterator.theory;

import java.util.Iterator;

/**
 * @author YangLiuQing
 * @date 2020/6/11 16:55
 * 学院
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name,String des);

    //返回一个迭代器
    public Iterator createIterator();
}
