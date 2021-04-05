package sort;

import java.awt.font.FontRenderContext;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubblieSort {
    public static void main(String[] args) {
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        //测试冒泡排序
        bubblesort();

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序后的时间是=" + date2Str);
    }
    public static void bubblesort(){
        int[] arr = new int[8000];
        boolean flag = true;
        for(int i =0;i<8000;i++){
            arr[i] = (int)(Math.random()*80000000);
        }

        int temp = 0;
        for(int j =0;j<arr.length-1;j++){
            for(int i =0;i<arr.length-j-1;i++){
                if(arr[i]>arr[i+1]){
                    flag = false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if(flag){
                break;
            }else{
                flag = true;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
