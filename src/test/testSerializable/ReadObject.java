package test.testSerializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @Author: Blue
 * @Date: 2021/7/20
 * @Time: 22:16
 * @Description:
 */
public class ReadObject {
    public static void main(String[] args) {
        try (//创建一个ObjectInputStream输入流
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
            Person brady = (Person) ois.readObject();
            System.out.println(brady);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}