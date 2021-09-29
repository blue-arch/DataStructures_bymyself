package test.TreeTest;

class Solution {
    public int longestMountain(int[] A) {
        //想出来了，为什么没有胆量写出来呢？
        int len = A.length;
        if(len<=0){
            return 0;
        }
        int left = 0;
        int ans = 0;
        while(left+2<len){
            int right = left+1;
            if(A[left]<A[right]){
                while(right<len-1&&A[right]<A[right+1]){
                    right++;
                }
                while(right<len-1&&A[right]>A[right+1]){
                    right++;
                }
                if(right==len-1&&A[right]>A[right-1]){
                    break;
                }
                ans = Math.max(ans,right - left+1);
            }else{
                left++;
            }
            left=right;
        }
        return ans;
    }
}