package TreeTest;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 17208
 */
public class ConstructTreeTest {
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        //Integer[] nums = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        Integer[] nums = {1,null,3,2};
        TreeNode root = ConstructTree.constructTree(nums);
        new ConstructTreeTest().preOrder(root);
        //int[] num1 = {1,2};
        //int[] num2 = {3,4};
        Solution s = new Solution();
        int[] A= {2,1,4,7,3,2,5,4,3,2,1,0,8};

        System.out.println(s.longestMountain(A));

    }
}
