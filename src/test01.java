import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class test01 {
    public static void main(String[] args) {
        int[] a = {3,5,0,3,4};
        Solution so = new Solution();
        System.out.println(so.find132pattern(a));

    }
}
class Solution {
    public boolean find132pattern(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>((a, b)->(b - a));
        int n = nums.length;
        int l = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0; i--) {
            if(nums[i] < l) {
                return true;
            }
            while(!queue.isEmpty()&&nums[i] > queue.peek()) {
                l = queue.poll();
                break;
            }
            queue.offer(nums[i]);
        }
        return false;
    }
}