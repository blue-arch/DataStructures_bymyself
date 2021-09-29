package test.testHashSet;

public class Person {
    public int age;
    public int height;
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (height != other.height)
            return false;
        return true;
    }
}