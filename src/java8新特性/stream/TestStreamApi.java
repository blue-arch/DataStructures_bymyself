package java8新特性.stream;

import java8新特性.lambda表达式.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 21:26
 * @Description:
 */
public class TestStreamApi {
    @Test
    public void test01(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .map((x) -> x * x)
                .forEach(System.out::println);
    }

    List<Employee> emps = Arrays.asList(
            new Employee(101, "Z3", 19, 9999.99),
            new Employee(102, "L4", 20, 7777.77),
            new Employee(103, "W5", 35, 6666.66),
            new Employee(104, "Tom", 44, 1111.11),
            new Employee(105, "Jerry", 60, 4444.44)
    );

    @Test
    public void test02(){
        Optional<Integer> result = emps.stream()
                .map((e) -> 1)
                .reduce(Integer::sum);
        System.out.println(result.get());
    }


}
