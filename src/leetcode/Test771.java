package leetcode;

public class Test771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("gsdf","afvdgv"));
    }
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0;i<S.length();i++){
            for(int j = 0;j<J.length();j++){
                if(S.charAt(i)==(J.charAt(j))){
                    count++;
                }
            }
        }
        return count;
    }
    public int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];

        for(int ch:nums){
            temp[ch]++;
        }
        int count = 0;
        for(int i:temp){
            count+=(i*(i-1))/2;
        }
        return count;
    }
}
