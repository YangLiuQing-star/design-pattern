package iterator.jdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/17 19:35
 */
public class JDKTest {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Bob");
        Iterator<String> iterator = ls.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
