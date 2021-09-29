package test.testSerializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author: Blue
 * @Date: 2021/7/20
 * @Time: 22:25
 * @Description:
 */
public class Teacher implements Serializable {

    private String name;
    private Person person;

    public Teacher(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public static void main(String[] args) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            Person person = new Person("路飞", 20);
            Teacher teacher = new Teacher("雷利", person);
            oos.writeObject(teacher);
        }
    }

    public Person getPerson() {
        return this.person;
    }
}