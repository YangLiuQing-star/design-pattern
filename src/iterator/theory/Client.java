package iterator.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/11 17:22
 * 迭代器模式
 */
public class Client {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        //创建学院
        College computerCollege = new ComputerCollege();
        College infoCollege = new InfoCollege();

        //添加学院到大学
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        //创建输出对象
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
