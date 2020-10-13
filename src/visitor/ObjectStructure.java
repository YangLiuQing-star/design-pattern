package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author YangLiuQing
 * @date 2020/6/11 10:36
 * 数据结构，用来管理(Man和Woman)
 */
public class ObjectStructure {

   //维护了一个集合
   private List<Person> persons = new LinkedList<>();

   //增加到list
    public void attach(Person person){
        persons.add(person);
    }

    //移除
    public void detach(Person person){
        persons.remove(person);
    }

    //显示测评情况
    public void display(Action action){
        for(Person p:persons){
            p.accept(action);
        }
    }
}
