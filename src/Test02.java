public class Test02 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int x){
        if (x==0){
            return 0;
        }
        return f(x-1)+x*x;
    }
}
