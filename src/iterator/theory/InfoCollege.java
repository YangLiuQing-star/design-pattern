package iterator.theory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/11 16:59
 */
public class InfoCollege implements College{
    List<Department> ls;

    public InfoCollege(){
        ls = new ArrayList<Department>();
        addDepartment("信息安全专业","信息安全专业");
        addDepartment("网络安全专业","网络安全专业");
        addDepartment("服务器安全专业","服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department dept = new Department(name, des);
        ls.add(dept);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(ls);
    }
}
