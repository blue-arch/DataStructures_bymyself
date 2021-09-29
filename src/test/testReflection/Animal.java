package test.testReflection;

/**
 * @Author: Blue
 * @Date: 2021/7/10
 * @Time: 21:56
 * @Description:
 */
public class Animal {
    //无参构造方法
    public Animal(){
        System.out.println("这是一个无参的构造方法");
    }
    //一个参数的构造方法
    public Animal(String name){
        System.out.println("小动物是" + name);
    }
    //两个参数的构造方法
    public Animal(String name, String food){
        System.out.println("小动物是" + name + "，它爱吃" + food);
    }
    //私有构造方法
    private Animal(int num){
        System.out.println("这里有" + num + "只小狗");
    }
}
