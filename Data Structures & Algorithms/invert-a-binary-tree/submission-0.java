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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        helper(root);
        return root;
    }

    private void helper(TreeNode tn) {
        if (tn == null) {
            return;
        }
        helper(tn.left);
        helper(tn.right);
        TreeNode temp = tn.right;
        tn.right = tn.left;
        tn.left = temp;
        return;
    }
}
