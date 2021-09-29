package sort;

import java.util.Arrays;

/**
 * @author 17208
 */
public class MergetSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        boolean flag = true;
        for(int i =0;i<80000;i++){
            arr[i] = (int)(Math.random()*800000000);
        }
        int[] temp = new int[arr.length];
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        mergeSort(arr,0,arr.length-1,temp);
        long timestamp1 = System.currentTimeMillis();
        System.out.println(timestamp1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr ,int left,int right,int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid,temp);

            mergeSort(arr,mid+1,right,temp);

            merge(arr,left,mid,right,temp);
        }
    }

    private static void merge(int[] arr, int left, int mid,int right,int[] temp) {
        int i=left;
        int j = mid+1;
        int t =0;
        while (i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<=right){
            temp[t++] = arr[j++];
        }
        for(int m = 0;m<t;m++){
            arr[left+m]=temp[m];
        }
    }
}

    //将有序数组a[]和b[]合并到c[]中
//    void MemeryArray(int a[], int n, int b[], int m, int c[])
//    {
//        int i, j, k;
//
//        i = j = k = 0;
//        while (i < n && j < m)
//        {
//            if (a[i] < b[j])
//                c[k++] = a[i++];
//            else
//                c[k++] = b[j++];
//        }
//
//        while (i < n)
//            c[k++] = a[i++];
//
//        while (j < m)
//            c[k++] = b[j++];
//    }