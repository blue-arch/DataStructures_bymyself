package algorithm.kmp;

import java.util.Arrays;

public class kmpAlgorithm {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        System.out.println(Arrays.toString(kmpNext(str2)));

        int[] next = kmpNext("abcabcabcabcabcabcabcabc");
        System.out.println(Arrays.toString(next));

//        int index = kmpSearch(str1, str2, next);
//        System.out.println("index=" + index); // 15了
    }
    public static int kmpSearch(String str1, String str2, int[] next) {

        //遍历
        for(int i = 0, j = 0; i < str1.length(); i++) {

            //需要处理 str1.charAt(i) ！= str2.charAt(j), 去调整j的大小
            //KMP算法核心点, 可以验证...
            while( j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j-1];
            }

            if(str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if(j == str2.length()) {//找到了 // j = 3 i
                return i - j + 1;
            }
        }
        return  -1;
    }

    public static int[] kmpNext(String dest){
        //创建一个next 数组保存部分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0; //如果字符串是长度为1 部分匹配值就是0
        for(int i = 1, j = 0; i < dest.length(); i++) {
            //当dest.charAt(i) != dest.charAt(j) ，我们需要从next[j-1]获取新的j
            //直到我们发现 有  dest.charAt(i) == dest.charAt(j)成立才退出
            //这时kmp算法的核心点
            //
            while(j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j-1];
            }

            //当dest.charAt(i) == dest.charAt(j) 满足时，部分匹配值就是+1
            if(dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
