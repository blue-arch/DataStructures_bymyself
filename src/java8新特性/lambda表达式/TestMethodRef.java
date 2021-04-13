package java8新特性.lambda表达式;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 19:45
 * @Description:
 */
public class TestMethodRef {
    @Test
    public void test01(){
        PrintStream ps = System.out;
        Consumer<String> con1 = (s) -> ps.println(s);
        con1.accept("aaa");

        Consumer<String> con2 = ps::println;
        con2.accept("bbb");
    }

    @Test
    public void test03(){
        BiPredicate<String, String> bp1 = (x, y) -> x.equals(y);
        System.out.println(bp1.test("a","b"));

        BiPredicate<String, String> bp2 = String::equals;
        System.out.println(bp2.test("c","c"));
    }


}
