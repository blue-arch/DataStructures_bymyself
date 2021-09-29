package test.testReflection;

import java.lang.reflect.Constructor;

/**
 * @Author: Blue
 * @Date: 2021/7/10
 * @Time: 22:17
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("test.testReflection.Animal");
        Constructor constructor = c.getConstructor(String.class, String.class);
        constructor.newInstance("小狗", "骨头");
    }
}
