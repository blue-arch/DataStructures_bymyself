package test.testStatic;

import java.util.Random;

/**
 * @Author: Blue
 * @Date: 2021/8/2
 * @Time: 22:46
 * @Description:
 */
public class test1 {
    public int a = 1;
    public static void dfs(int[] res) {
        for(int i = 0; i < res.length; ++i) {
            System.out.print(res[i] + " ");
        }
//        System.out.println(test1.a);
    }

    public static void main(String[] args) {
        int[] res = new int[10];
        Random random = new Random();
//        for()
    }

}
