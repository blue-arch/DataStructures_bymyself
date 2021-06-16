package test;



/**
 * @Author: Blue
 * @Date: 2021/5/5
 * @Time: 19:51
 * @Description:
 */
public class Test1473 {
    public static void main(String[] args) {
        int[] houses = {0,0,0,0,0};
        int[][] cost = {{1,10},{10,1},{10,1},{1,10},{5,1}};
        int m = 5;
        int n = 2;
        int target = 3;
        Solution5 st = new Solution5();
        System.out.println(st.minCost(houses, cost, m, n ,target));
        System.out.println(Integer.MAX_VALUE);
    }


}
class Solution5 {
    int INF = 0x3f3f3f3f;
    int ans = INF;
    int[] hs;
    int[][] cost;
    int m, n, t;
    boolean[][][] vis;
    int[][][] cache;
    public int minCost(int[] _hs, int[][] _cost, int _m, int _n, int _t) {
        m = _m; n = _n; t = _t;
        hs = _hs;
        cost = _cost;
        vis = new boolean[m + 1][n + 1][t + 1];
        cache = new int[m +1][n +1][t + 1];
        int ans = dfs(0, 0, 0, 0);
        return ans == INF ? -1 : ans;
    }
    // u : 当前处理到的房间编号
    // last : 当前处理的房间颜色
    // cnt : 当前形成的分区数量
    // sum : 当前的上色成本

    public int dfs(int u, int last, int cnt, int sum) {
        if(cnt > t) return INF;
        if(vis[u][last][cnt]) return cache[u][last][cnt];
        if (u == m) return cnt == t ? 0 : INF;
        int ans = INF;
        int color = hs[u];
        if(color == 0){
            for(int i = 1; i <= n; i++){
                int nCnt = u == 0 ? 1 : last == i ? cnt : cnt + 1;
                int cur = dfs(u + 1, i, nCnt, sum + cost[u][i - 1]);
                ans = Math.min(ans, cur + cost[u][i - 1]);
            }
        } else{
            int nCnt = u == 0 ? 1 : last == color ? cnt : cnt + 1;
            int cur = dfs(u + 1, color, nCnt, sum);
            ans = Math.min(ans, cur);
        }
        vis[u][last][cnt] = true;
        cache[u][last][cnt] = ans;
        return ans;
    }
}