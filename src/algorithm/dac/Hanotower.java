package algorithm.dac;

public class Hanotower {
    public static void main(String[] args) {
        hanoTower(10,'a','b','c');
    }
    public static void hanoTower(int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            hanoTower(num-1,a,c,b);
            System.out.println(a+"->"+c);
            hanoTower(num-1,b,a,c);
        }
    }
}
