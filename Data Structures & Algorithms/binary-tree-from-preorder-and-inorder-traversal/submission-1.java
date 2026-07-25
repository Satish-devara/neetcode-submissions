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
      HashMap<Integer, Integer> mpp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
      

        for(int i = 0 ; i < inorder.length; i++){
            mpp.put(inorder[i], i);
        }

        return dfs(preorder, 0, preorder.length -1, inorder, 0, inorder.length-1);
    }

    public TreeNode dfs(int[] preOrder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        
        if(preStart > preEnd || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(preOrder[preStart]);

    

        int rootIdx = mpp.get(root.val);
        int numsLeft = rootIdx - inStart;

        root.left = dfs(preOrder, preStart + 1, preStart + numsLeft, inorder, inStart, rootIdx - 1);
        root.right = dfs(preOrder, preStart + numsLeft + 1, preEnd, inorder, rootIdx + 1, inEnd);

        return root;
    }
}
