package test.testReflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
        String className = "test.testReflection.demo.Foo";
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

    @org.junit.Test
    public void testField()throws Exception {
        /*
         * 动态获取一个类的全部属性信息
         * 1 动态加载一个类到方法区
         * 2 动态获取类的属性信息
         */
        String className = "test.testReflection.demo.Eoo";
        //动态加载类
        Class cls = Class.forName(className);
        //动态获取类声明的属性信息
        Field[] all = cls.getDeclaredFields();
        for (Field field : all) {
            //getName 获取属性的名字
            System.out.print(field.getName()+" ");
        }
    }
    @org.junit.Test
    public void testCon() throws Exception{
        /*
         * 1 动态加载类
         */
        String className = "test.testReflection.demo.Eoo";
        Class cls = Class.forName(className);

        Constructor[] all = cls.getDeclaredConstructors();
        for (Constructor c : all) {
            System.out.print(c.getName());
            //获取构造器的参数类型列表
            // Parameter 参数  Type类型
            // Class[] 代表所有参数的类型列表
            Class[] types = c.getParameterTypes();
            System.out.println(Arrays.toString(types));
        }
    }

    @org.junit.Test
    public void testNewInstance() throws Exception{
        /*
         * 动态调用无参数构造器创建对象
         * 1 动态加载类
         * 2 利用class 的方法 newInstance 执行
         * 无参数构造器常见对象
         * 注意：类必须有无参数，否则出异常
         */
        String className = "java.util.Date";
        Class cls = Class.forName(className);
        // cls.newInstance()调用无参数构造器创建对象
        Object obj = cls.newInstance();
        System.out.println(obj);

        //静态的创建对象！编译已经就固定了！
        Date date = new Date();
    }

    /**
     * 调用 className 类名对应的类的有参数构造器，paramTypes 代表对应构造器的参数列表
     * className + paramTypes 共同决定调用哪个构造器！执行构造器还需要具体的参数params
     */
    public Object create(String className,Class[] paramTypes,Object[] params)
            throws Exception{
        // 动态加载类
        // 动态获取指定参数类型的构造器
        // 执行这个构造器，传递 params 参数。
        Class cls = Class.forName(className);
        //getDeclaredConstructor 在类信息中查找
        //给定参数类型的构造器信息
        Constructor c = cls.getDeclaredConstructor(paramTypes);
        //执行构造器 c.newInstance() 方法，创建对象
        //返回值就是这个构造器创建的对象
        Object obj = c.newInstance(params);
        return obj;
    }
    @org.junit.Test
    public void testCreate() throws Exception {
        String className = "java.util.Date";
        //类型列表==Class类型的数组
        Class[] paramTypes = {long.class};
        //实际参数列表
        Object[] params={-1000L*60*60*24*365};
        Object obj = create(className, paramTypes, params);
        System.out.println(obj);
        //思考：如何动态调用 new String("Hello");
        className = "java.lang.String";
        /*
         * {} 只能拥有声明变量时候直接初始化
         * 不能用于赋值语句！
         * 赋值语句可以使用 new Object[]{"Hello"}
         */
        paramTypes = new Class[]{String.class};
        params = new Object[]{"Hello"};
        obj = create(className, paramTypes, params);
        System.out.println(obj);//Hello

        //思考：如何动态调用 new String(byte[],"utf-8");
        obj = create("java.lang.String",
                new Class[]{byte[].class, String.class},
                new Object[]{new byte[]{65,66,67,68}, "UTF-8"});
        System.out.println(obj);
    }

    /**
     * 获取obj对象的 fieldName 对应属性的值
     * @param obj
     * @param fieldName
     * @return 属性值
     */
    public Object get(Object obj, String fieldName)throws Exception{
        //1 获取类信息
        /*
         * Java 中对象的getClass()方法可以获取 对象的类型信息！
         * Java 中 有3种方法可以获取Class信息
         *  1. 类名.class 获取类信息(静态)
         *  2. Class.forName("类名") 获取类信息 动态
         *  3. obj.getClass() 获取类信息。运行期间，通过当前对象获取类信息
         */
        Class cls = obj.getClass();
        //找到属性:
        /*
         * getDeclaredField 按照属性名在cls中查找
         * 类信息。 当属性没有找到时候，抛出异常！
         */
        Field field = cls.getDeclaredField(fieldName);
        //在对象上获取属性的值！
        /*
         * get方法：在一个对象上获取属性的值，对象上没有对应的属性，抛出异常
         */
        Object value = field.get(obj);
        return value;
    }

    @org.junit.Test
    public void testGetField()throws Exception {
        /*
         * 动态获取对象的属性
         */
        Goo goo = new Goo(5, "Tom");
        Object v1 = get(goo, "id");
        Object v2 = get(goo, "name");
        System.out.println(v1+" "+v2);
    }

    @org.junit.Test
    public void testinvoke()throws Exception{
        List<String> list=new ArrayList<String>();
        list.add("tom");
        list.add("jack");
        // 动态获取类信息
        Class cls = list.getClass();
        // 通过方法名和参数类型找到对应的方法
        Method method = cls.getDeclaredMethod("remove", new Class[]{int.class});
        // 调用方法，传递对象和具体参数
        Object value=method.invoke(list,new Object[]{0});
        System.out.println(value); //tom
    }

}
