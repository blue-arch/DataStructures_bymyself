package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 17208
 */
public class Test202 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(7));
    }
}

class Solution {
    static Set<Integer> set = new HashSet<>();
    //static int count=0;
    public boolean isHappy(int n) {
        set.add(n);
        return isHappy1(n);
    }
    public boolean isHappy1(int n) {
        if(n == 1){
            return true;
        }
        set.add(n);
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        if(set.contains(sum)){
            return false;
        }
        return isHappy1(sum);
    }
}


