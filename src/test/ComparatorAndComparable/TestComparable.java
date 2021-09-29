package test.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {
        //测试Comparable接口
        Person p1=new Person("clyang",18,4000);
        Person p2=new Person("messi",30,8000);
        Person p3=new Person("ronald",32,9000);
        Person p4=new Person("herry",19,7600);
        Person p5=new Person("roben",35,7900);

        //添加到集合
        List<Person> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("-----------------排序前-----------------");
        for (Person person : list) {
            System.out.println(person);
        }
        //排序一般使用Collections.sort方法，或者使用Arrays.sort方法，按照比较的元素进行自然排序，即从小到大
        Collections.sort(list);

        System.out.println("-----------------排序后-----------------");
        for (Person person : list) {
            System.out.println(person);
        }

    }
}