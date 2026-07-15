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
    public int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        calculate(root);
        return maxDia;
    }

    public int calculate(TreeNode root){
        if(root == null) return 0;

        int left = calculate(root.left);
        int right = calculate(root.right);

        maxDia = Math.max(maxDia, left + right);

        return 1+Math.max(left, right);
    }
}
