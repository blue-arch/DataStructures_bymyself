package dongtaiguihua;

import org.junit.Test;

public class Knapsack {
    private static int[] P={0,5,8};
    private static int[] V={0,5,7};
    private static int T = 10;

    @Test
    public void soleve1() {
        int result = ks(P.length - 1,10);
        System.out.println("最大价值为：" + result);
    }

    private int ks(int i, int t){
        int result = 0;
        if (i == 0 || t == 0){
            // 初始条件
            result = 0;
        } else if(V[i] > t){
            // 装不下该珠宝
            result = ks(i-1, t);
        } else {
            // 可以装下
            // 取k个物品i，取其中使得总价值最大的k
            for (int k = 0; k * V[i] <= t; k++){
                int tmp2 = ks(i-1, t - V[i] * k) + P[i] * k;
                if (tmp2 > result){
                    result = tmp2;
                }
            }
        }
        return result;
    }
}
class Knapsack2 {
    private static int[] P={0,5,8};
    private static int[] V={0,5,7};
    private static int T = 10;

    private Integer[][] results = new Integer[P.length + 1][T + 1];

    @Test
    public void solve2() {
        int result = ks2(P.length - 1,10);
        System.out.println("最大价值为：" + result);
    }

    private int ks2(int i, int t){
        // 如果该结果已经被计算，那么直接返回
        if (results[i][t] != null) return results[i][t];
        int result = 0;
        if (i == 0 || t == 0){
            // 初始条件
            result = 0;
        } else if(V[i] > t){
            // 装不下该珠宝
            result = ks2(i-1, t);
        } else {
            // 可以装下
            // 取k个物品，取其中使得价值最大的
            for (int k = 0; k * V[i] <= t; k++){
                int tmp2 = ks2(i-1, t - V[i] * k) + P[i] * k;
                if (tmp2 > result){
                    result = tmp2;
                }
            }
        }
        results[i][t] = result;
        return result;
    }
}
class Knapsack3 {
    private static int[] P={5,8};
    private static int[] V={5,7};
    private static int T = 10;

    private int[][] dp = new int[P.length + 1][T + 1];

    @Test
    public void solve3() {
        for (int i = 0; i < P.length; i++){
            for (int j = 0; j <= T; j++){
                for (int k = 0; k * V[i] <= j; k++){
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j-k * V[i]] + k * P[i]);
                }
            }
        }
        System.out.println("最大价值为：" + dp[P.length][T]);
    }
}
class Knapsack4 {
    private static int[] P={0,5,8};
    private static int[] V={0,5,7};
    private static int T = 10;

    private int[] newResults = new int[T + 1];

    @Test
    public void resolve4() {
        int result = ksp(P.length,T);
        System.out.println(result);
    }

    private int ksp(int i, int t){
        // 开始填表
        for (int m = 0; m < i; m++){
            for (int n = V[m]; n <= t; n++){
                newResults[n] = Math.max(newResults[n] , newResults[n - V[m]] + P[m]);
            }
            // 可以在这里输出中间结果
            //System.out.println(JSON.toJSONString(newResults));
        }
        return newResults[newResults.length - 1];
    }
}