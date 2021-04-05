package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[8000];
        boolean flag = true;
        for(int i =0;i<8000;i++){
            arr[i] = (int)(Math.random()*800000000);
        }
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        sort(arr);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);
    }

    private static void sort(int[] arr) {
        for(int i =1;i<arr.length;i++){
            int insertValue =  arr[i];
            int insertIndex = i-1;
            while(insertIndex>=0&&insertValue<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1!=i) {
                arr[insertIndex + 1] = insertValue;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
