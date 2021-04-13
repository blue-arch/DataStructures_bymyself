package java8新特性.lambda表达式;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 17:53
 * @Description:
 */
public class Test02 {
    int num = 10; //jdk 1.7以前 必须final修饰

    @Test
    public void test01(){
        //匿名内部类
        new Runnable() {
            @Override
            public void run() {
                //在局部类中引用同级局部变量
                //只读
                System.out.println("Hello World" + num);
            }
        };
    }

    @Test
    public void test02(){
        //语法糖
        Runnable runnable = () -> {
            System.out.println("Hello Lambda");
        };
    }

    @Test
    public void test03(){
        Consumer<String> consumer = (a) -> System.out.println(a);
        consumer.accept("我觉得还行！");
    }

    @Test
    public void test04(){
        Comparator<Integer> comparator = (a, b) -> {
            System.out.println("比较接口");
            return Integer.compare(a, b);
        };
    }

    @Test
    public void test05(){
        MyFun myFun1 = (a, b) -> a + b;
        MyFun myFun2 = (a, b) -> a - b;
        MyFun myFun3 = (a, b) -> a * b;
        MyFun myFun4 = (a, b) -> a / b;
    }

    public Integer operation(Integer a, Integer b, MyFun myFun){
        return myFun.count(a, b);
    }

    @Test
    public void test06(){
        Integer result = operation(1, 2, (x, y) -> x + y);
        System.out.println(result);
    }

    //需求： 对两个long型数据进行处理
    public void op(Long l1, Long l2, MyFun2<Long, Long> mf) {
        System.out.println(mf.getValue(l1,l2));
    }

    @Test
    public void test07(){
        op(100L, 200L, (x, y) -> x + y);

    }


}
