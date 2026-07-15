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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return ans;

        rightView(root, 0);

        return ans;

    }

    public void rightView(TreeNode root, int depth){
        if(root == null) return;

        if(ans.size() == depth){
            ans.add(root.val);
        }

        rightView(root.right, depth + 1);
        rightView(root.left, depth + 1);
    }
}
