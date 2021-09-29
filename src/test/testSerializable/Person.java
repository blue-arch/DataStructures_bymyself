package test.testSerializable;

import java.io.Serializable;

/**
 * @Author: Blue
 * @Date: 2021/7/20
 * @Time: 22:08
 * @Description:
 */
public class Person implements Serializable {
    private String name;
    private int age;
    //我不提供无参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}