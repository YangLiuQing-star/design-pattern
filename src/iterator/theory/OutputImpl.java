package iterator.theory;

import java.util.Iterator;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/11 17:12
 */
public class OutputImpl {

    //获取学院的集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有的学院以及各个学院包含的系
    public void printCollege(){
        //从List中取出所有的学院，java中的List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while(iterator.hasNext()){
            //取出一个学院
            College college = iterator.next();
            //输出学院的名字
            System.out.println("========"+college.getName()+"==========");
            //得到遍历各个学院中系的迭代器
            printDept(college.createIterator());
        }
    }

    //学院输出系
    public void printDept(Iterator iterator){
        while(iterator.hasNext()){//判断下一个位置是否有值
            //取出下一个位置的值
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
