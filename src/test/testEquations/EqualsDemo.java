package test.testEquations;

import java.util.HashSet;
import java.util.Set;

public class EqualsDemo {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        Set<String> set1 = new HashSet<>();
        set1.add(s1);
        set1.add(s2);
        System.out.println(set1.size());

        System.out.println("==============");

        String s3 = "cbd";
        String s4 = "cbd";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        Set<String> set3 = new HashSet<>();
        set3.add(s3);
        set3.add(s3);
        System.out.println(set3.size());

        System.out.println("==============");

        Person person1 = new Person("abc");
        Person person2 = new Person("abc");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        Set<Person> set2 = new HashSet<>();
        set2.add(person1);
        set2.add(person2);
        System.out.println(set2.size());
    }
}