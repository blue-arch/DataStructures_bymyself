package search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13,14,15,16,17,18,19,20 };

        System.out.println(search(arr,0,arr.length-1,12));

        System.out.println(binSearch(arr,12));
    }

    public static int search(int[] arr,int left,int right,int findval){
        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        int midval = arr[mid];

        if (findval > midval) { // 向 右递归
            return search(arr, mid + 1, right, findval);
        } else if (findval < midval) { // 向左递归
            return search(arr, left, mid - 1, findval);
        } else {

            return mid;
        }


    }
    public static List<Integer> search2(int[] arr, int left, int right, int findval){
        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        int midval = arr[mid];

        if (findval > midval) { // 向 右递归
            return search2(arr, mid + 1, right, findval);
        } else if (findval < midval) { // 向左递归
            return search2(arr, left, mid - 1, findval);
        } else {

            //			 * 思路分析
//			 * 1. 在找到mid 索引值，不要马上返回
//			 * 2. 向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
//			 * 3. 向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
//			 * 4. 将Arraylist返回

            List<Integer> resIndexlist = new ArrayList<Integer>();
            //向mid 索引值的左边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            int temp = mid - 1;
            while(true) {
                if (temp < 0 || arr[temp] != findval) {//退出
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp -= 1; //temp左移
            }
            resIndexlist.add(mid);  //

            //向mid 索引值的右边扫描，将所有满足 1000， 的元素的下标，加入到集合ArrayList
            temp = mid + 1;
            while(true) {
                if (temp > arr.length - 1 || arr[temp] != findval) {//退出
                    break;
                }
                //否则，就temp 放入到 resIndexlist
                resIndexlist.add(temp);
                temp += 1; //temp右移
            }

            return  resIndexlist;
        }


    }
    public static int binSearch(int[] a,int index){
        int begin = 0;
        int end = a.length - 1;
        int mid = (begin+end)/2;
        while(begin<=end) {
            mid = (begin+end)/2;
            if (a[mid] == index) {
                return mid;
            } else if (a[mid] < index) {
                begin = mid+1;
                //mid = (begin+end)/2;
            } else {
                end = mid-1;
                //mid = (begin+end)/2;
            }
        }
        return -1;
    }
}
