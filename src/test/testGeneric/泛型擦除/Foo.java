package test.testGeneric.泛型擦除;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Blue
 * @Date: 2021/7/14
 * @Time: 16:28
 * @Description:
 */
public class Foo {
    public void inspect(List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        list.add(1); //这个操作在当前方法的上下文是合法的。
    }
    public void test() {
        List<String> strs = new ArrayList<String>();
//        inspect(strs); //编译错误
    }
    Object t = "fdsdf";
}