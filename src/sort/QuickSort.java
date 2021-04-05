package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        boolean flag = true;
        for(int i =0;i<80000;i++){
            arr[i] = (int)(Math.random()*800000000);
        }
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        sort(arr,0,arr.length-1);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int left,int right) {
        if(left>right){
            return;
        }
        int i=left,j=right;
        int base = arr[left];
        while (i<j){
            while (i<j&&arr[j]>base){
                j--;
            }
            if (i<j){
                arr[i] = arr[j];
                i++;
            }
            while (i<j&&arr[i]<base){
                i++;
            }
            if (i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        arr[i] = base;
        sort(arr,left,i-1);
        sort(arr,i+1,right);
        //System.out.println(Arrays.toString(arr));
    }
}
