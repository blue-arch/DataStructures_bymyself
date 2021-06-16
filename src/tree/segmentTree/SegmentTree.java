package tree.segmentTree;

import java.util.Arrays;

/**
 * @Author: Blue
 * @Date: 2021/5/25
 * @Time: 13:29
 * @Description:
 */
public class SegmentTree {
//    int[] arr = {1,3,5,7,9};
//    int size = arr.length;
//    int[] tree = new int[10000];
    public void buildTree(int[] arr, int[] tree, int node, int start, int end) {
        if(start == end) {
            tree[node] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        int left_node = 2 * node + 1;
        int right_node = 2 * node + 2;
        buildTree(arr, tree, left_node, start, mid);
        buildTree(arr, tree, right_node, mid + 1, end);
        tree[node] = tree[left_node] + tree[right_node];
    }
    public void updateTree(int[] arr, int[] tree, int node, int start, int end, int index, int val) {
        if(start == end) {
            arr[index] = val;
            tree[node] = val;
            return;
        }
        int mid = (start + end) / 2;
        int left_node = 2 * node + 1;
        int right_node = 2 * node + 2;
        if(index >= start && index <= mid) {
            updateTree(arr, tree, left_node, start, mid, index, val);
        }else {
            updateTree(arr, tree, right_node, mid + 1, end, index, val);
        }
        tree[node] = tree[left_node] + tree[right_node];
    }

    public int query(int[] arr, int[] tree, int node, int start, int end, int l, int r) {
        if(r < start || l > end) {
            return 0;

        }else if(start>=l && end <= r){
            return tree[node];
        }else if(start == end) { //这个递归出口只有到叶子节点才返回
            return tree[node];
        }
        int mid = (start + end) / 2;
        int left_node = 2 * node + 1;
        int right_node = 2 * node + 2;
        int sum_left = query(arr,tree,left_node,start,mid,l,r);
        int sum_right = query(arr,tree,right_node,mid+1,end,l,r);
        return sum_left + sum_right;
    }
}

class  test {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int size = arr.length;
        int[] tree = new int[100];
        SegmentTree s = new SegmentTree();
        s.buildTree(arr,tree,0,0,size - 1);
        System.out.println(Arrays.toString(tree));
        s.updateTree(arr,tree,0,0,size - 1,4,6);
        System.out.println(Arrays.toString(tree));
        int res = s.query(arr,tree,0,0,size - 1,2,6);
        System.out.println(res);
    }
}