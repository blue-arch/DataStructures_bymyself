package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        boolean flag = true;
        for(int i =0;i<8000000;i++){
            arr[i] = (int)(Math.random()*800000000);
        }
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        sort2(arr);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);
    }

    private static void sort(int[] arr) {
        int temp = 0;
        for(int gap = arr.length/2;gap>0;gap/=2){
            for(int i =gap;i<arr.length;i++){
                for(int j = i-gap;j>=0;j-=gap){
                    if (arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void sort2(int[] arr) {

        // 增量gap, 并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];

                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;


            }
        }
        //System.out.println(Arrays.toString(arr));
    }
}
