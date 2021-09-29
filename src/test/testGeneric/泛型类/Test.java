package test.testGeneric.泛型类;


import lombok.extern.java.Log;

/**
 * @Author: Blue
 * @Date: 2021/7/13
 * @Time: 15:32
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_vlaue");
        System.out.println("泛型测试"+"key is " + genericInteger.getKey());
        System.out.println("泛型测试"+"key is " + genericString.getKey());
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        Test.showKeyValue1(gInteger);
    }

    public static void showKeyValue1(Generic<?> obj){
        System.out.println("泛型测试"+"key value is " + obj.getKey());
    }
}
