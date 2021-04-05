package leetcode;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;

public class Test476 {
    public static void main(String[] args) {


        int a=129;
        int b=-128;
        System.out.println(Integer.toBinaryString(a));
//        System.out.println("a 和b 与的结果是："+(a&b));
//        System.out.println("a 非的结果是："+(~a));
//        System.out.println("a 与 b 异或的结果是："+(a^b));
        //System.out.println(Integer.toBinaryString(a>>1));
//        System.out.println(Integer.toBinaryString(b&a));
//        System.out.println(b/2);
//        System.out.println(Integer.toBinaryString(b/2));
//        System.out.println(Integer.bitCount(a));
//        System.out.println(Integer.valueOf("1010"));
//        Deque<String> stack = new LinkedList<>();
//
//        System.out.println("fasf".charAt(0));
//        int[][] sdf = {{},{1,2}};
//        System.out.println(sdf[1][0]);
//        System.out.println(Arrays.deepToString(sdf));
//        String s = Integer.toBinaryString(b&a);
//        StringBuilder stringbuilder = new StringBuilder("afaf");
//        System.out.println(stringbuilder);
        String[] arr = {"awfda","fvdsgvdf","asrg","grsg","gag"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() != o2.length() ? Integer.compare(o2.length(),o1.length()):o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(arr));


    }
}
