package dongtaiguihua;

import org.junit.Test;

public class back {
    int[] vs = {0,2,4,3,7};
    int[] ws = {0,2,3,5,5};

    @Test
    public void testKnapsack1() {
        int result = ks(4,10);
        System.out.println(result);
    }

    private int ks(int i, int c){
        int result = 0;
        if (i == 0 || c == 0){
            // 初始条件
            result = 0;
        } else if(ws[i] > c){
            // 装不下该珠宝
            result = ks(i-1, c);
        } else {
            // 可以装下
            int tmp1 = ks(i-1, c);
            int tmp2 = ks(i-1, c-ws[i]) + vs[i];
            result = Math.max(tmp1, tmp2);
        }
        return result;
    }
}


class Solution1{
    int[] vs = {0,2,4,3,7};
    int[] ws = {0,2,3,5,5};
    Integer[][] results = new Integer[5][11];

    @Test
    public void testKnapsack2() {
        int result = ks2(4,10);
        System.out.println(result);
    }

    private int ks2(int i, int c){
        int result = 0;
        // 如果该结果已经被计算，那么直接返回
        if (results[i][c] != null) {
            return results[i][c];
        }
        if (i == 0 || c == 0){
            // 初始条件
            result = 0;
        } else if(ws[i] > c){
            // 装不下该珠宝
            result = ks2(i-1, c);
        } else {
            // 可以装下
            int tmp1 = ks2(i-1, c);
            int tmp2 = ks2(i-1, c-ws[i]) + vs[i];
            result = Math.max(tmp1, tmp2);
            results[i][c] = result;
        }
        return result;
    }
}
class Solution{
    int[] vs = {0,2,4,3,7};
    int[] ws = {0,2,3,5,5};
    Integer[][] results = new Integer[5][11];

    @Test
    public void testKnapsack3() {
        int result = ks3(4,10);
        System.out.println(result);
    }

    private int ks3(int i, int j){
        // 初始化
        for (int m = 0; m <= i; m++){
            results[m][0] = 0;
        }
        for (int m = 0; m <= j; m++){
            results[0][m] = 0;
        }
        // 开始填表
        for (int m = 1; m <= i; m++){
            for (int n = 1; n <= j; n++){
                if (n < ws[m]){
                    // 装不进去
                    results[m][n] = results[m-1][n];
                } else {
                    // 容量足够
                    if (results[m-1][n] > results[m-1][n-ws[m]] + vs[m]){
                        // 不装该珠宝，最优价值更大
                        results[m][n] = results[m-1][n];
                    } else {
                        results[m][n] = results[m-1][n-ws[m]] + vs[m];
                    }
                }
            }
        }
        return results[i][j];
    }
}