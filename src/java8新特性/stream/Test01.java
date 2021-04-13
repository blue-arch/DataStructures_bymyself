package java8新特性.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Blue
 * @Date: 2021/4/13
 * @Time: 20:12
 * @Description:
 */
public class Test01 {
    @Test
    public void test01(){
        /**
         * 集合流
         *  - Collection.stream() 穿行流
         *  - Collection.parallelStream() 并行流
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //数组流
        //Arrays.stream(array)
        String[] strings = new String[10];
        Stream<String> stream2 = Arrays.stream(strings);

        //Stream 静态方法
        //Stream.of(...)
        Stream<Integer> stream3 = Stream.of(1, 2, 3);

        //无限流
        //迭代
        Stream<Integer> stream4 = Stream.iterate(0, (i) -> ++i+i++);
        stream4.forEach(System.out::println);

        //生成
        Stream.generate(() -> Math.random())
                .limit(5)
                .forEach(System.out::println);
    }



}
