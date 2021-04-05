public class Test05 {
    public static void main(String[] args) {
        T a = new T();
        System.out.println(a.getNum());
        System.out.println(a.getNum());
    }
}

class T{
    int num;
    public int getNum() {
        return num++;
    }

}

