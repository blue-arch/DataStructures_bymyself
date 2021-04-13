package java8新特性.stream;

import java8新特性.lambda表达式.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 20:21
 * @Description:
 */
public class Test02 {
    List<Employee> emps = Arrays.asList(
            new Employee(101, "Z3", 19, 9999.99),
            new Employee(102, "L4", 20, 7777.77),
            new Employee(103, "W5", 35, 6666.66),
            new Employee(104, "Tom", 44, 1111.11),
            new Employee(105, "Jerry", 60, 4444.44)
    );

    @Test
    public void test02(){
        emps.stream()
                .filter((e) -> {
                    System.out.println("eraghe");
                    return e.getAge() > 35;
                })
                .forEach(System.out::println);
    }
    @Test
    public void test01(){
        emps.stream()
                .filter((x) -> x.getAge() > 35)
                .limit(3) //短路？达到满足不再内部迭代
                .distinct()
                .skip(1)
                .forEach(System.out::println);
    }

    @Test
    public void test03(){
        emps.stream()
                .filter((e) ->  e.getAge() > 35)
                .limit(1)
                .forEach(System.out::println);
    }

    @Test
    public void test04(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);
        emps.stream()
                .map(Employee::getAge)
                .forEach(System.out::println);
    }

    public Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }

    @Test
    public void test05(){
        List<String> list = Arrays.asList("a", "b", "c");
        Test02 test02 = new Test02();
        list.stream()
                .flatMap(test02::filterCharacter)
                .forEach(System.out::println);
    }

    @Test
    public void test06(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .sorted() //comparaTo()
                .forEach(System.out::println);
    }

    @Test
    public void test07(){
        emps.stream()
                .sorted((e1, e2) -> { //compara()
                    if (e1.getAge().equals(e2.getAge())){
                        return e1.getName().compareTo(e2.getName());
                    } else {
                        return e1.getAge().compareTo(e2.getAge());
                    }
                })
                .forEach(System.out::println);
    }






}
