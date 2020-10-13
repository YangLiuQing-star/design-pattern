package iterator.theory;

import java.util.Iterator;

/**
 * @author YangLiuQing
 * @date 2020/6/11 16:59
 * 计算机学院
 */
public class ComputerCollege implements College{

    Department[] depts;
    //保存当前数组的元素个数
    int numOfDepartment = 0;

    public ComputerCollege() {
        depts = new Department[5];
        //添加专业
        addDepartment("Java专业","Java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department dept = new Department(name,des);
        depts[numOfDepartment] = dept;
        numOfDepartment++;
    }

    /**
     * 返回一个包含计算机学院中系的迭代器
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(depts);
    }
}
