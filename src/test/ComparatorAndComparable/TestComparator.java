package test.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {
        //测试Comparator接口
        Staff p1=new Staff("clyang",18,4000);
        Staff p2=new Staff("messi",30,8000);
        Staff p3=new Staff("ronald",32,9000);
        Staff p4=new Staff("herry",18,7600);
        Staff p5=new Staff("roben",35,7900);

        //添加到集合
        List<Staff> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("-----------------排序前-----------------");
        for (Staff staff : list) {
            System.out.println(staff);
        }

        //排序，需要使用自定义比较类
        Comparator myComparator=new StaffComparator();
        Collections.sort(list,myComparator);

        System.out.println("-----------------排序后-----------------");
        for (Staff staff : list) {
            System.out.println(staff);
        }
    }
}