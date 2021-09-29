package test.testSerializable;

/**
 * @Author: Blue
 * @Date: 2021/7/21
 * @Time: 19:35
 * @Description:
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class WriteObject2 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
             ObjectInputStream ios = new ObjectInputStream(new FileInputStream("person.txt"))) {
            //第一次序列化person
            Person person = new Person("9龙", 23);
            oos.writeObject(person);
            System.out.println(person);

            //修改name
            person.setName("海贼王");
            System.out.println(person);
            //第二次序列化person
            oos.writeObject(person);

            //依次反序列化出p1、p2
            Person p1 = (Person) ios.readObject();
            Person p2 = (Person) ios.readObject();
            System.out.println(p1 == p2);
            System.out.println(p1.getName().equals(p2.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//输出结果
//Person{name='9龙', age=23}
//Person{name='海贼王', age=23}
//true
//true