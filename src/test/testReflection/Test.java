package test.testReflection;

import java.lang.reflect.Method;

public class Test {
    @org.junit.Test
    public void test1() {
        String str = new String("Hello");
        Class cls = String.class;
        //动态获取 String类型的方法信息：
        Method[] all = cls.getDeclaredMethods();
        //Method 代表方法的信息
        // method.getName 可以获取方法的名称
        for (Method method : all) {
            System.out.println(method.getName());
        }
    }

    @org.junit.Test
    public void testClassForName(){
        /*
         * 动态的加载类信息到方法区
         * 并且返回对应的Class对象！
         * Class 对象可以访问类的全部信息！
         *
         * 将className对应的类文件，从磁盘中加载
         * 内存方法区，返回这个类的信息
         */
        String className = "demo.Foo";
        try {
            Class cls = Class.forName(className);
            Method[] all = cls.getDeclaredMethods();
            for (Method method : all) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
