package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {


    public static void main(String[] args) {
        int[] arr = new int[8000];
        boolean flag = true;
        for(int i =0;i<8000;i++){
            arr[i] = (int)(Math.random()*800000000);
        }
//        Date data1 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date1Str = simpleDateFormat.format(data1);
//        System.out.println("排序前的时间是=" + date1Str);
//
//        //测试选择排序
//        sort(arr);
//
//        Date data2 = new Date();
//        String date2Str = simpleDateFormat.format(data2);
//        System.out.println("排序后的时间是=" + date2Str);
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        sort(arr);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);

    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int temp = i;
            for(int j =i+1;j<arr.length;j++){
                if (arr[j]<min){
                    temp = j;
                    min = arr[j];
                }
            }
            if(min!=arr[i]){
                arr[temp] = arr[i];
                arr[i] = min;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
