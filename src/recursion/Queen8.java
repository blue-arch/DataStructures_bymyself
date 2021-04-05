package recursion;

public class Queen8 {
    int max = 8;
    int[] arr = new int[max];
    static int judgeCount=0;
    static int count;
    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.println("一共有"+count+"种解法");
        System.out.println(judgeCount+"种冲突");
    }
    private void check(int n){
        if(n==8){
            print();
            return;
        }
        for(int i =0;i<max;i++){
            arr[n] = i;
            if(judge(n)){
                check(n+1);
            }
        }
    }
    private boolean judge(int n){
        judgeCount++;
        for(int i=0;i<n;i++) {
            if (arr[i]==arr[n]||Math.abs(arr[i]-arr[n])==Math.abs(i-n)){
                return false;
            }
        }
        return true;
    }
    public void print(){
        count++;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
