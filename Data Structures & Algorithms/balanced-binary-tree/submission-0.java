/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int result = helper(root);
        return result != -1;
    }

    private int helper(TreeNode tn) {
        if (tn == null) {
            return 0;
        }

        int left = helper(tn.left);
        int right = helper(tn.right);

        if (left == -1 || right == -1 || Math.abs(left-right) > 1) {
            return -1;
        } else if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
}
