package search;

import java.util.Arrays;

public class FiboncciSearch {
    public static void main(String[] args) {
        int[] a={0,16,24,35,47,59,62,73,88,99};
        System.out.println(fibSearch(a,88));
    }

    public static int MaxSize=20;  //先为斐波那契数列设置长度
    //构建你波拉契数列
    public static int[] fib(){
        int[] f=new int[MaxSize];
        f[0]=1;
        f[1]=1;
        for (int i=2;i<MaxSize;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }
    public static int fibSearch(int[] arr,int key){
        int left=0;  //初始指向最数组最左边
        int right=arr.length-1; //初始指向最数组最右边
        int k=0;  //指示斐波那契数列的下标，初始为0是为了根据数组长度确定数组需要扩展的长度
        int mid=0;
        int[] f=fib(); //获取斐波那契数列
        while (arr.length>f[k]-1){ //这里的f[k]是arr距离斐波那契数列最近的数值，为什么-1，为了符合数组特性(数组最大元素下标是数组长度-1)
            k++;
        }
        int[] temp= Arrays.copyOf(arr,f[k]); //为什么构建一个新数组，因为下面需要对数组进行扩展，查找最后还要用到原始数组，所以不能用原始数组
        //扩展数组
        for (int i=right+1;i<temp.length;i++){  //这里为什么用temp.length?因为上面Arrays.copyOf(arr,f[k])已经对数组扩展了，这里我们进行的是把扩展的值都改为原始数组的最大值
            temp[i]=arr[right];
        }

        while (left<=right){
            mid=left+f[k-1]-1;   //这里就是为mid确定位置，位置确定请看上面的图
            if (key<temp[mid]){  //如果当前mid值大于key，说明key在mid左边部分，继续对左边的F[k-1]-1部分进行分割
                right=mid-1;
                k--;
            }else if (key>temp[mid]){
                left=mid+1;
                k-=2;
            }else {
                if (mid<arr.length){ //查找值的下标在arr数组额范围内，直接返回
                    return mid;
                }else { //不在就返回right,为什么？因为后面几位的值和right的值是一样的，说明查找的值就是right
                    return right;
                }
            }
        }
        //都找不到返回-1
        return -1;

    }
}
