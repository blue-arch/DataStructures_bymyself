package java8新特性.lambda表达式;

import org.junit.Test;

import java.util.*;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 17:05
 * @Description:
 */
public class Test01 {
    @Test
    public void test01(){
        //匿名内部类
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        //调用
        TreeSet<Integer> set = new TreeSet<>(comparator);
    }

    @Test
    public void test02(){
        // Lambda 表达式
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);

        TreeSet<Integer> set = new TreeSet<>(comparator);
    }

    List<Employee> emps = Arrays.asList(
            new Employee(101, "Z3", 19, 9999.99),
            new Employee(102, "L4", 20, 7777.77),
            new Employee(103, "W5", 35, 6666.66),
            new Employee(104, "Tom", 44, 1111.11),
            new Employee(105, "Jerry", 60, 4444.44)
    );
    @Test
    public void test03(){
        Collections.sort(emps, (e1, e2) -> {
            if (e1.getAge().equals(e2.getAge())){
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }





}
