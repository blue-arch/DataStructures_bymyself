package tree;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[80000000];
        for(int i =0;i<80000000;i++){
            arr[i] = (int)(Math.random()*80000000);
        }
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        heapSort(arr);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);

    }
    public static void heapSort(int[] arr){
        System.out.println("堆排序如下。。。。。");
//        adjustHeap(arr,1,arr.length);
//        System.out.println("第一次"+Arrays.toString(arr));
//
//        adjustHeap(arr,0,arr.length);
//        System.out.println("第二次"+Arrays.toString(arr));
        for(int i =arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        //System.out.println("第二次"+Arrays.toString(arr));
        //选择排序思想
        int temp;
        for(int j=arr.length-1;j>0;j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,j);
        }
        //System.out.println("数组="+Arrays.toString(arr));
    }
    public static void adjustHeap(int[] arr,int i,int length){

        int temp = arr[i];
        for(int k = i*2+1;k<length;k=k*2+1){
            if (k+1<length&&arr[k]<arr[k+1]){//左子
                k++;
            }
            if (arr[k]>temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }
}









//    public static int numJewelsInStones(String J, String S) {
//        int count = 0;
//        for(int i = 0;i<S.length();i++){
//            for(int j = 0;j<J.length();j++){
//                if(S.charAt(i)==(J.charAt(j))){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
