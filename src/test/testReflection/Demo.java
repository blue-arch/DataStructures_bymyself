package test.testReflection;

import java.lang.reflect.Constructor;

/**
 * @Author: Blue
 * @Date: 2021/7/10
 * @Time: 22:00
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("test.testReflection.Animal");
        Constructor constructor = c.getConstructor(null);
        constructor.newInstance(null);
    }
}
