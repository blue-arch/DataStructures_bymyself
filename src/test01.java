import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class test01 {
    public static void main(String[] args) {
        String temp = "Let's take LeetCode contest";
        System.out.println(new Solution().reverseWords(temp));

    }
}
class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder buffer = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {
//            String temp = strs[i].reverse();
//            buffer.append(temp);
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}