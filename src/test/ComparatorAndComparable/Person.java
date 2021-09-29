package test.ComparatorAndComparable;

public class Person implements Comparable<Person>{

    //属性
    private String name;
    private int age;
    private int salary;

    //get和set方法
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //构造方法
    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //重写接口方法,o为要比较的对象
    @Override
    public int compareTo(Person o) {
        //大于要比较的对象就返回1
        if(this.salary>o.getSalary()){
            return 1;
        }
        //小于则返回-1
        else if(this.salary<o.getSalary()){
            return -1;
        }
        //相等则返回0
        return 0;
    }
}
